import interfaces.ISell;

public class Strings extends Shop implements ISell{

    private String brand;


    public Strings(int stock, double cost, double sellingPrice, double markUp, String brand){
        super(stock, cost, sellingPrice, markUp);
        this.brand = brand;
    }


    public String getBrand() {
        return this.brand;
    }

    public double calculateMarkUp(double cost, double sellingPrice) {
        markUp = sellingPrice - cost;
        return markUp;
    }
}
