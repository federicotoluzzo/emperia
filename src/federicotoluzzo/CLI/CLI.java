/*
package federicotoluzzo.CLI;

import federicotoluzzo.Reign;
import federicotoluzzo.Terrain;

import java.util.Scanner;

public class CLI {
    private federicotoluzzo.Reign reign;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLI cli = new CLI();
        final String PROMPT = """
                \t1.\tCrea regno
                \t2.\tAnnetti territorio
                \t3.\tCostruisci
                \t4.\tIspeziona magazzino
                \tA.\tCarica salvataggio
                \tS.\tSalva
                \tX.\tSalva ed esci
                """;
        while(true){
            System.out.println(PROMPT);
            System.out.print("Scegli cosa fare : ");
            char option = sc.nextLine().charAt(0);
            switch (option) {
                case '1':
                    System.out.print("Dai un nome al tuo regno : ");
                    String nome = sc.nextLine();
                    cli.createReign(nome);
                    System.out.println("Regno creato con nome \"" + nome + "\"");
                    break;
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();
                case '2':
                    cli.annexTerritory();

            }
        }
    }

    private void createReign(String name){
        int gold = 0; // !!! TODO: FAR ASSEGNARE DAL SERVER !!!
        reign = new Reign(name, gold);
    }

    private void annexTerritory(){

    }

    private void build(){

    }

    private void inspectWarehouse(){
        reign.printWarehouse();
    }

    private void loadSave(){

    }

    private void save(){
    }

    private void exit(){
        save();
    }
}
*/
