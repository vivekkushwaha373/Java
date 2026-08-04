package lld_design_patterns.behavioral.command;

/**
 * GOOD EXAMPLE: The Invoker.
 * 
 * The remote control only knows how to trigger a Command. 
 * It has ZERO knowledge of what the command does, or that a "Light" even exists.
 * We can dynamically swap commands at runtime!
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("Remote button pressed...");
        if (command != null) {
            command.execute();
        }
    }
}
