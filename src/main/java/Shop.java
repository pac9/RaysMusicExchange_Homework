import interfaces.ISell;

public class Shop implements ISell {

    private int stock;
    private double cost;
    private double sellingPrice;
    public double markUp;

    public Shop(int stock, double cost, double sellingPrice, double markUp){
        this.stock = stock;
        this.cost = cost;
        this.sellingPrice = sellingPrice;
        this.markUp= markUp;
    }


    public int getStock() {
        return stock;
    }

    public double getCost() {
        return cost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp(double cost, double sellingPrice) {
        markUp = sellingPrice - cost;
        return markUp;
    }
}
