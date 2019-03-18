package Models.Movies;

public class NewReleaseMovie extends Movie{
    private static final double dailyPrice = 3;

    private static final double bonusStartDays = 2;

    private int days;

    public NewReleaseMovie(String title, int priceCode, int days) {
        super(title, priceCode);

        this.days = days;
    }

    public double getCharge(int days) {
        return dailyPrice * days;
    }

    public int getBonusPoint() {
        if(days > bonusStartDays) return 2;
        else return 1;
    }
}
