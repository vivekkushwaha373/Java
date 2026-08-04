package lld_design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * GOOD EXAMPLE: Concrete Subject.
 * 
 * It manages a list of observers and notifies them when its state changes.
 * It is completely decoupled from the specific observer implementations.
 */
public class WeatherStation implements Subject {

    // Program to an interface, not an implementation!
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            // Push the new state to all observers
            observer.update(temperature);
        }
    }

    // State change triggers notification
    public void setTemperature(int temperature) {
        System.out.println("WeatherStation: New temperature measurement -> " + temperature);
        this.temperature = temperature;
        notifyObservers();
    }
}
