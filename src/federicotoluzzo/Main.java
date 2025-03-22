package federicotoluzzo;

import federicotoluzzo.network.Client;
import federicotoluzzo.types.BuildingType;
import federicotoluzzo.types.ResourceType;
import federicotoluzzo.types.TerrainType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Client.create("⣏ඞ⣹")); //ඞඞඞ
        System.out.println(Client.build(TerrainType.FIELD, BuildingType.FIELD)); //ඞඞඞ

        /*Reign test = new Reign("HO SCELTO ROMA", 999);
        Terrain t = Terrain.create(TerrainType.FIELD);
        System.out.println(t.build(new Building(BuildingType.FIELD, new Resource(ResourceType.VEGETABLE, 0))));
        test.addTerrain(t);

        Terrain t2 = Terrain.create(TerrainType.FOREST);
        System.out.println(t2.build(new Building(BuildingType.HUT, new Resource(ResourceType.WOOD, 0))));
        test.addTerrain(t2);

        Terrain t3 = Terrain.create(TerrainType.MOUNTAIN);
        System.out.println(t3.build(new Building(BuildingType.QUARRY, new Resource(ResourceType.STONE, 0))));
        test.addTerrain(t3);

        Terrain t4 = Terrain.create(TerrainType.FIELD);
        System.out.println(t4.build(new Building(BuildingType.FARM, new Resource(ResourceType.MEAT, 0))));
        test.addTerrain(t4);

        Terrain t5 = Terrain.create(TerrainType.MOUNTAIN);
        System.out.println(t5.build(new Building(BuildingType.MINE, new Resource(ResourceType.IRON, 0))));
        test.addTerrain(t5);*/
    }
}
