package Models.Movies;

public class RegularMovie extends Movie {
    private static final double startPrice = 2;
    private static final double dailyPrice = 1.5;

    private static final int startDays = 2;
    private static final int bonusPoints = 1;

    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getCharge(int days) {
        if(days > startDays) {
            return startPrice + (days - startDays) * dailyPrice;
        }
        else {
            return startPrice;
        }
    }

    public int getBonusPoint() {
        return  bonusPoints;
    }
}
