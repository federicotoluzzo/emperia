package federicotoluzzo.network;

import federicotoluzzo.types.BuildingType;
import federicotoluzzo.types.TerrainType;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class Client {
    public static ArrayList<String> create(String name) {
        Socket socket = null;
        ArrayList<String> response = new ArrayList<String>();
        try{
            socket = new Socket("192.168.4.60", 6830);


            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("CREATE");
            out.println(name);
            out.flush();


            if(in.readLine().equalsIgnoreCase("OK")){ // Oll Korrect
                response.add(in.readLine());
                response.add(in.readLine());
                response.add(in.readLine());
                response.add(in.readLine());
                response.add(in.readLine());
                response.add(in.readLine());
                response.add(in.readLine());
            } else {
                return null;
            }

            out.close();
            in.close();

        } catch (Exception e){
            e.printStackTrace();
        }

        return response;
    }

    public static boolean build(TerrainType tt, BuildingType bt) {
        Socket socket = null;
        boolean response = true;
        try{
            socket = new Socket("192.168.4.60", 6830);


            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("BUILD");
            out.println(tt.toString());
            out.println(bt.toString());
            out.flush();


            if(in.readLine().equalsIgnoreCase("OK")){ // Oll Korrect
                response = true;
            } else {
                response = false;
            }

            out.close();
            in.close();

        } catch (Exception e){
            e.printStackTrace();
        }

        return response;
    }

    public static boolean remove(String name) {
        Socket socket = null;
        try{
            socket = new Socket("192.168.4.60", 6830);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("DELETE");
            out.println(name);
            out.flush();
            return in.readLine().equalsIgnoreCase("OK"); // Oll Korrect
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<String> getReigns() {
        Socket socket = null;
        ArrayList<String> response = new ArrayList<String>();
        try{
            socket = new Socket("192.168.4.60", 6830);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("GET_REIGNS");
            out.flush();

            String s = in.readLine();
            while(!s.equals("")){
                response.add(s);
                s = in.readLine();
            }

            return response; // Oll Korrect
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
