public class Strings extends Shop{

    private String brand;


    public Strings(int stock, double cost, double sellingPrice, String brand){
        super(stock, cost, sellingPrice);
        this.brand = brand;
    }


    public String getBrand() {
        return this.brand;
    }
}
