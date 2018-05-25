public class Shop {

    private int stock;
    private double cost;
    private double sellingPrice;

    public Shop(int stock, double cost, double sellingPrice){
        this.stock = stock;
        this.cost = cost;
        this.sellingPrice = sellingPrice;
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
}
