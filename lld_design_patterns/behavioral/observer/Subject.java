package lld_design_patterns.behavioral.observer;

/**
 * GOOD EXAMPLE: The Subject Interface (Publisher).
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
