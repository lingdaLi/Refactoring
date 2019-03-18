package Models;

import Models.Movies.Movie;

public class Rental {
    public Movie movie;
    public int days;

    public Rental(Movie movie, int days) {
        this.days = days;
        this.movie = movie;
    }

    public double getCharge() {
        return movie.getCharge(days);
    }

    public int getBonusPoint() {
        return this.movie.getBonusPoint();
    }
}
