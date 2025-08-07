package Java.Training.Netflix.src;

import java.util.HashSet;

public class TVShow extends Movie {

    public HashSet<Episode> episodes = new HashSet<>();

    TVShow(String title, String genre, String releaseYear, String duration) {
        super(title, genre, releaseYear, duration);
    }

    public String createEpisode(String title, int episodeNumber, String duration) {
        new Episode(title, episodeNumber, duration);
        return "Episode created successfully.";
    }
}
