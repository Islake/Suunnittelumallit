package factorymethod;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        Map cityMap = game.createMap("city");
        System.out.println("City Map:");
        cityMap.display(10, 10);

        Map wildernessMap = game.createMap("wilderness");
        System.out.println("\nWilderness Map:");
        wildernessMap.display(10, 10);
    }

    public Map createMap(String type) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap();
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap();
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}
