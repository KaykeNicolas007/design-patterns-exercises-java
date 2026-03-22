package singleton.unresolved;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private final Map<String, String> settings = new HashMap<>();

    public AppConfig() {
        settings.put("app.name", "Order System");
        settings.put("app.version", "1.0.0");
        settings.put("app.environment", "production");
    }

    public String get(String key) {
        return settings.get(key);
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }
}
