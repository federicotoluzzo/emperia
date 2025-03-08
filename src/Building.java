import types.BuildingType;
import types.ResourceType;

import java.util.concurrent.TimeUnit;

public class Building implements Runnable {
    private BuildingType type;
    private ResourceType resource;
    private Resource production;
    private int productionRate;

    public Building(BuildingType type, Resource production) {
        this.type = type;
        this.production = production;
        this.productionRate = switch (type) {
            case BuildingType.QUARRY -> 3;
            case BuildingType.FARM -> 20;
            case BuildingType.FIELD -> 50;
            case BuildingType.HUT -> 10;
            case BuildingType.MINE -> 1;
        };
        this.resource = switch (type){
            case BuildingType.QUARRY -> ResourceType.STONE;
            case BuildingType.FARM -> ResourceType.MEAT;
            case BuildingType.FIELD -> ResourceType.VEGETABLE;
            case BuildingType.HUT -> ResourceType.WOOD;
            case BuildingType.MINE -> ResourceType.IRON;
        };
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
                TimeUnit.SECONDS.sleep(
                    switch (production.getType()) {
                        case IRON -> 3;
                        case WOOD -> 5;
                        case MEAT -> 30;
                        case STONE -> 2;
                        case VEGETABLE -> 15;
                    }
                );
                production.setQuantity(production.getQuantity() + productionRate);
            } catch (InterruptedException chissene) {}
        }
    }

    public ResourceType getResource() {
        return resource;
    }
}
