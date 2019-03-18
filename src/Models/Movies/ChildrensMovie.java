package Models.Movies;

public class ChildrensMovie extends Movie {
    private static final double startPrice = 1.5;
    private static final double dailyPrice = 1.5;

    private static final int startDays = 3;
    private static final int bonusPoints = 1;

    public ChildrensMovie(String title, int priceCode) {
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
        return bonusPoints;
    }
}
