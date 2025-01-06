package utils;

import java.util.UUID;

public class Helper {
    private static String getUniqueId() {
        return String.format("%s_%s", UUID.randomUUID().toString().substring(0, 5), System.currentTimeMillis() / 1000);
    }

    public static String generateRandomEmail() {
        return String.format("%s@%s", getUniqueId(), "gmail.com");
    }
}
