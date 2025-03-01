import types.TerrainType;

public class Main {
    public static void main(String[] args) {
        Reign test = new Reign("HO SCELTO ROMA", 104);
        test.addTerrain(Terrain.create(TerrainType.FIELD));
        test.addTerrain(Terrain.create(TerrainType.FOREST));
        test.addTerrain(Terrain.create(TerrainType.MOUNTAIN));
        test.addTerrain(Terrain.create(TerrainType.FOREST));
        test.addTerrain(Terrain.create(TerrainType.FIELD));
        test.printWarehouse();
    }
}
