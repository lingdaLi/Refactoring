package Models;

public class Movie {
    public static final int Childrens = 2;
    public static final int Regular = 0;
    public static final int NewRelease = 1;

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
}
