package lld_design_patterns.structural.decorator;

/**
 * BAD EXAMPLE: Using inheritance to extend behavior leads to "Class Explosion".
 * 
 * If a user wants to be notified via Email AND SMS, we have to create `EmailAndSMSNotifier`.
 * If we add Slack, we need `EmailAndSlackNotifier`, `SMSAndSlackNotifier`, 
 * `EmailSMSAndSlackNotifier`... this is unmaintainable!
 */
public class BadNotifier {
    
    public void send(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}

class BadSMSNotifier extends BadNotifier {
    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending SMS: " + msg);
    }
}

class BadSlackNotifier extends BadNotifier {
    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending Slack: " + msg);
    }
}
// We'd have to keep creating combinations...
