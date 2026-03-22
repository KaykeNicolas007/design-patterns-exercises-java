package singleton.unresolved;

public class LoginService {
    private final AppConfig config;

    public LoginService() {
        this.config = new AppConfig();
    }

    public void login(String user) {
        System.out.println("[" + config.get("app.name") + "] User logged in: " + user);
    }
}
