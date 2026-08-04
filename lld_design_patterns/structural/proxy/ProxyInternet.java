package lld_design_patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * GOOD EXAMPLE: The Proxy (Specifically, a Protection Proxy).
 * 
 * It controls access to the RealInternet. It intercepts the call, 
 * performs some logic (checking for banned sites), and only then 
 * delegates to the Real Subject.
 */
public class ProxyInternet implements Internet {

    // The proxy holds a reference to the real subject.
    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned.com");
        bannedSites.add("socialmedia.com");
        bannedSites.add("games.com");
    }

    @Override
    public void connectTo(String host) throws Exception {
        if (bannedSites.contains(host.toLowerCase())) {
            throw new Exception("Access Denied to " + host);
        }
        
        // If the check passes, delegate to the real object.
        realInternet.connectTo(host);
    }
}
