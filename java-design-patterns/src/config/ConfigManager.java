package config;

public class ConfigManager {
    private static ConfigManager instance;
    private String defaultNotificator = "email";

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getDefaultNotificator() {
        return defaultNotificator;
    }

    public void setDefaultNotificator(String notificator) {
        this.defaultNotificator = notificator;
    }
}
