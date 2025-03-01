import types.BuildingType;
import types.TerrainType;

import java.util.HashSet;

public class Terrain {
    protected TerrainType type;
    protected HashSet<BuildingType> options;
    protected Building building;

    public Terrain(TerrainType type, HashSet<BuildingType> options) {
        this.type = type;
        this.options = options;
    }

    public TerrainType getType() {
        return type;
    }

    public HashSet<BuildingType> getOptions() {
        return options;
    }

    public Building getBuilding() {
        return building;
    }

    public void build(Building building) {
        if(options.contains(building.getType())) {
            this.building = building;
            this.building.run();
        }
    }

    public static Terrain create(TerrainType type) {
        switch(type){
            case TerrainType.FIELD -> {
                HashSet<BuildingType> options = new HashSet<>();
                options.add(BuildingType.FIELD);
                options.add(BuildingType.FARM);
                return new Terrain(type, options);
            }
            case TerrainType.MOUNTAIN -> {
                HashSet<BuildingType> options = new HashSet<>();
                options.add(BuildingType.MINE);
                options.add(BuildingType.QUARRY);
                return new Terrain(type, options);
            }
            case TerrainType.FOREST -> {
                HashSet<BuildingType> options = new HashSet<>();
                options.add(BuildingType.HUT);
                return new Terrain(type, options);
            }
        };
        return null;
    }
}
