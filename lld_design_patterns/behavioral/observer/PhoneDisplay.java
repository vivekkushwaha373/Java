package lld_design_patterns.behavioral.observer;

/**
 * GOOD EXAMPLE: Concrete Observer 1.
 */
public class PhoneDisplay implements Observer {
    
    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature + " degrees.");
    }
}
