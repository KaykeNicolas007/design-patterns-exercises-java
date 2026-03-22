package singleton.resolved;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private final Map<String, String> settings = new HashMap<>();
    private static AppConfig instance;

    private AppConfig() {
        settings.put("app.name", "Order System");
        settings.put("app.version", "1.0.0");
        settings.put("app.environment", "production");
    }

    public static AppConfig getInstance() {
        if (instance == null)
            instance = new AppConfig();
        return instance;
    }

    public String get(String key) {
        return settings.get(key);
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }

    public boolean isEquals(Object object) {
        return this.equals(object);
    }
}
