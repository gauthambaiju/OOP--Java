package Java.Training.Netflix.src;

import java.util.HashSet;

public class Auth {
    private static HashSet<String> usernames = new HashSet<>();

    public static String createAccount(String username, String password) {
        if (!usernames.contains(username)) {
            usernames.add(username);
            new User(username, password);
            return "Registration successful.";
        } else {
            return "Registration failed.";
        }
    }
}
