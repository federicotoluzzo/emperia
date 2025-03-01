import types.ResourceType;

public class Reign {
    private Resource[] warehouse;
    private String name;
    private int gold;
    private Terrain[] map;

    public Reign(String name, int gold) {
        this.name = name;
        this.gold = gold;

        map =  new Terrain[5];
        warehouse = new Resource[ResourceType.values().length];

        fillWarehouse();
    }

    public void addTerrain(Terrain terrain) {
        for (int i = 0; i < map.length; i++) {
            if(map[i] == null) {
                map[i] = terrain;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Too many terrains.");
    }

    private void fillWarehouse() {
        for (int i = 0; i < ResourceType.values().length; i++) {
            warehouse[i] = new Resource(ResourceType.values()[i], 0);
        }
    }

    public void printWarehouse() {
        for (Resource r : warehouse) {
            System.out.printf("%s : %d\n", r.getType().name(), r.getQuantity());
        }
    }

    public Terrain getTerrain(int index){
        return map[index];
    }
}
