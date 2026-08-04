package lld_design_patterns.behavioral.observer;

/**
 * GOOD EXAMPLE: Concrete Observer 2.
 */
public class WindowDisplay implements Observer {
    
    @Override
    public void update(int temperature) {
        System.out.println("Window Smart Display: It is currently " + temperature + " outside.");
    }
}
