package federicotoluzzo;

public class Reign {
    private Warehouse warehouse;
    private String name;
    private int gold;
    private Terrain[] map;

    public Reign(String name, int gold) {
        this.name = name;
        this.gold = gold;

        map = new Terrain[5];
        warehouse = new Warehouse(map);
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

    public void printWarehouse() {
        System.out.println(warehouse);
    }

    public Terrain getTerrain(int index){
        return map[index];
    }
}
