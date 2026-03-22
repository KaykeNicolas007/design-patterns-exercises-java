package singleton;

public class LoginService {
    private final AppConfig config;

    public LoginService() {
        this.config = AppConfig.getInstance();
    }

    public void login(String user) {
        System.out.println("[" + config.get("app.name") + "] User logged in: " + user);
    }

    public AppConfig getConfig(){
        return config;
    }
}
