package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<WeatherObserver> observers;
    private int temperature;
    private boolean running;

    public WeatherStation() {
        observers = new ArrayList<>();
        temperature = new Random().nextInt(100); // Initial random temperature
        running = true;
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        while (running) {
            try {
                Thread.sleep(random.nextInt(5000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int change = random.nextInt(3) - 1;
            temperature = Math.max(0, Math.min(100, temperature + change));
            notifyObservers();
        }
    }

    public void stop() {
        running = false;
    }
}