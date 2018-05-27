import interfaces.ISell;

import java.lang.String;

public class Reed extends Shop implements ISell{

    private double strength;


    public Reed(int stock, double cost, double sellingPrice, double markUp, double strength){
        super(stock, cost, sellingPrice, markUp);
        this.strength = strength;
    }


    public double getStrength() {
        return this.strength;
    }

    public int totalStock(int stock){
        return getStock();
    }
}
