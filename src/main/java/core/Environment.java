package core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum Environment {

    DEV("/env/dev.properties"),
    PROD("/env/dev.properties");

    public final String url;

    Environment(String name) {
        try (InputStream input = Environment.class.getResourceAsStream(name)) {
            Properties properties = new Properties();
            properties.load(input);
            url = properties.getProperty("URL");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Environment getEnvironment() {
        String env = System.getProperty("env", "DEV");
        return Environment.valueOf(env);
    }

}
