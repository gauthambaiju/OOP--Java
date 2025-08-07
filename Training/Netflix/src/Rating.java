package Java.Training.Netflix.src;

public class Rating<T> {
    String ratedBy;
    int rating;
    T ratedFor;

    Rating(String ratedBy, int rating, T ratedFor) {
        this.ratedBy = ratedBy;
        this.rating = rating;
        this.ratedFor = ratedFor;
    }
}
