package Models;

import Models.Movies.Movie;

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
        // I know in book they use a getTotalCharge() function to replace this variable.
        // But personally I don't like that way due to it will case redundant getTotalPrice()
        // call.
        double amount = 0;
        int bonusPoints = 0;

        Enumeration rentals = this.rentals.elements();
        String result = "Records for " + this.getName() + "\n";

        while(rentals.hasMoreElements()){
            Rental rental = (Rental) rentals.nextElement();

            double currentAmount = rental.getCharge();
            result += "\t" + rental.movie.getTitle() + "\t" + String.valueOf(currentAmount) + "\n";
            amount += currentAmount;

            bonusPoints += rental.getBonusPoint();
        }

        result += "Amount owed is " + String.valueOf(amount) + "\n";
        result += "You earned " + String.valueOf(bonusPoints) + " bonus points";
        return result;
    }
}
