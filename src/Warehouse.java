import types.ResourceType;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Warehouse implements Runnable {
    private Resource[] warehouse;
    private Terrain[] terrains;

    public Warehouse(Terrain[] terrains) {
        initWarehouse();
        this.terrains = terrains;
        Thread t = new Thread(this);
        t.start();
    }

    private void initWarehouse() {
        warehouse = new Resource[ResourceType.values().length];
        for (int i = 0; i < warehouse.length; i++) {
            warehouse[i] = new Resource(ResourceType.values()[i], 0);
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (Terrain t : terrains) {
                if(t != null){
                    if(t.getBuilding() != null){
                        for (Resource r : warehouse) {
                            if (r.getType() == t.getBuilding().getResource()){
                                r.setQuantity(r.getQuantity() + t.getBuilding().collect().getQuantity());
                            }
                        }
                    }
                }
            }
            System.out.println(toString());
        }
    }

    @Override
    public String toString(){
        String ret = "";
        ret += "Warehouse: \n";
        for (int i = 0; i < warehouse.length; i++) {
            Resource r = warehouse[i];
            ret += (i == warehouse.length - 1 ? "\u2514" : "\u251c") + r.toString() + "\n";
        }
        return ret;
    }
}
