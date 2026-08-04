package lld_design_patterns.behavioral.command;

/**
 * GOOD EXAMPLE: Concrete Command.
 * 
 * It wraps the Receiver (Light) and maps the execute() method 
 * to a specific action on the Receiver.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
