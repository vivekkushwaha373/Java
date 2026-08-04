package lld_design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * GOOD EXAMPLE: A Prototype Registry.
 * 
 * Often used alongside the Prototype pattern. Instead of instantiating new objects, 
 * you store pre-configured prototypes in a registry and just clone them when needed.
 */
public class ShapeRegistry {
    
    private Map<String, Shape> cache = new HashMap<>();

    public ShapeRegistry() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        circle.color = "Green";
        
        cache.put("Big Green Circle", circle);
    }

    public Shape get(String key) {
        // We do NOT return the original object. We return a CLONE.
        return cache.get(key).clone();
    }
}
