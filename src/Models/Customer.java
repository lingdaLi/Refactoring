package Models;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name){
        this.name = name;
    }

    public void addRental(Rental rental){
        rentals.addElement(rental);
    }

    public String getName(){
        return name;
    }

    public String statement(){
        double amount = 0;
        int bonusPoints = 0;

        Enumeration rentals = this.rentals.elements();
        String result = "Rental Records for " + this.getName() + "\n";

        while(rentals.hasMoreElements()){
            double currentAmount = 0;

            Rental cur = (Rental) rentals.nextElement();
            switch (cur.getMovie().getPriceCode()) {
                case Movie.Regular:
                    currentAmount += 2;
                    if (cur.getDaysRented() > 2)
                        currentAmount += (cur.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NewRelease:
                    currentAmount += cur.getDaysRented() * 3;
                    break;
                case Movie.Childrens:
                    currentAmount += 1.5;
                    if (cur.getDaysRented() > 3)
                        currentAmount += (cur.getDaysRented() - 3) * 1.5;
                    break;
            }

            bonusPoints++;
            if(cur.getMovie().getPriceCode() == Movie.NewRelease &&
                cur.getDaysRented() > 1)
                bonusPoints++;

            result += "\t" + cur.getMovie().getTitle() + "\t" + String.valueOf(currentAmount) + "\n";
            amount += currentAmount;
        }

        result += "Amount owed is " + String.valueOf(amount) + "\n";
        result += "You earned " + String.valueOf(bonusPoints) + " bonus points";
        return result;
    }
}
