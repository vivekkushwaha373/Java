package lld_design_patterns.behavioral.observer;

/**
 * BAD EXAMPLE: Tight coupling between the subject and the observers.
 * 
 * If we add a new display (e.g., SmartWatchDisplay), we have to come 
 * back into this class and modify `setTemperature`, violating OCP.
 */
public class BadWeatherStation {
    
    private int temperature;
    
    // Tightly coupled to concrete classes
    private PhoneDisplay phoneDisplay = new PhoneDisplay();
    private WindowDisplay windowDisplay = new WindowDisplay();

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        
        // Hardcoded notifications
        phoneDisplay.update(temperature);
        windowDisplay.update(temperature);
    }
}
