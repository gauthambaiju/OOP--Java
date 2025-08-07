package Java.Training.Netflix.src;

import java.util.HashSet;

public class User {
    private String username;
    private String password;
    private HashSet<Rating<Object>> ratings = new HashSet<>();
    private HashSet<String> watchlist = new HashSet<>();

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void addToWatchlist(String title) {
        this.watchlist.add(title);
    }
}
