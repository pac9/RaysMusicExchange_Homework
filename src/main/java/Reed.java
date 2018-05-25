import java.lang.String;

public class Reed extends Shop {

    private double strength;


    public Reed(int stock, double cost, double sellingPrice, double strength){
        super(stock, cost, sellingPrice);
        this.strength = strength;
    }


    public double getStrength() {
        return this.strength;
    }
}
