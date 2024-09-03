package factorymethod;

public class RoadTile implements Tile {
    @Override
    public String getCharacter() {
        return "🛣️";
    }

    @Override
    public String getType() {
        return "road";
    }
}