import interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    private int stock;
    private double cost;
    private double sellingPrice;
    public double markUp;
    private ArrayList<ISell> allStock;

    public Shop(int stock, double cost, double sellingPrice, double markUp){
        this.stock = stock;
        this.cost = cost;
        this.sellingPrice = sellingPrice;
        this.markUp= markUp;
        this.allStock = new ArrayList<>();
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

    public int totalStock(int stock){
        return this.stock;

    }

//    public void stock(ISell shopStock){
//        allStock.add(shopStock);
//    }

//    public int totalCurrentStock(){
//        int report = 0;
//        for (ISell shopStock : allStock){
//            report += shopStock.totalStock(this.stock);
//        }
//        return report;
//    }


}
