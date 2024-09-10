package observer;

public class WeatherStationSimulator {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Thread weatherThread = new Thread(weatherStation);

        WeatherObserver observer1 = new ConsoleObserver("Observer 1");
        WeatherObserver observer2 = new ConsoleObserver("Observer 2");
        WeatherObserver observer3 = new ConsoleObserver("Observer 3");

        weatherStation.registerObserver(observer1);
        weatherStation.registerObserver(observer2);
        weatherStation.registerObserver(observer3);

        weatherThread.start();

        try {
            Thread.sleep(15000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        weatherStation.removeObserver(observer2);
        System.out.println("Observer 2 removed");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        weatherStation.stop();
    }
}