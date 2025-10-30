package awesome.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties props = new Properties();

    static {
        String env = System.getProperty("env", ""); // Example: -Denv=qa
        String baseFile = "/config.properties";

        try (InputStream baseStream = ConfigReader.class.getResourceAsStream(baseFile)) {
            if (baseStream != null) {
                props.load(baseStream);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load base config.properties", e);
        }

        if (!env.isBlank()) {
            String envFile = "/config." + env + ".properties";
            try (InputStream envStream = ConfigReader.class.getResourceAsStream(envFile)) {
                if (envStream != null) {
                    props.load(envStream); // Override base values
                    System.out.println("Environment config loaded: " + envFile);
                } else {
                    System.out.println("No environment override file found for: " + env);
                }
            } catch (IOException e) {
                throw new RuntimeException("Failed to load " + envFile, e);
            }
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

    public static String get(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }
}
