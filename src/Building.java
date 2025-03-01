import types.BuildingType;
import types.ResourceType;

import java.util.concurrent.TimeUnit;

public class Building implements Runnable {
    private BuildingType type;
    private ResourceType resource;
    private Resource production;
    private int productionRate;

    public Building(BuildingType type, Resource production, int productionRate) {
        this.type = type;
        this.production = production;
        this.productionRate = productionRate;
    }

    public BuildingType getType() {
        return type;
    }

    public Resource collect(){
        Resource collected = production;
        production = new Resource(resource, 0);
        return collected;
    }

    public void run(){
        while(true){
            try {
                TimeUnit.SECONDS.sleep(1);
                production.setQuantity(production.getQuantity() + productionRate);
                System.out.println(production.getQuantity());
            } catch (InterruptedException chissene) {}
        }
    }
}
