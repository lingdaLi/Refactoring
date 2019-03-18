package Models.Movies;

public abstract class Movie {
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode(){
        return priceCode;
    }

    public void setPriceCode(int arg){
        priceCode = arg;
    }

    public String getTitle(){
        return title;
    }

    public abstract double getCharge(int days);

    public abstract int getBonusPoint();


}
