import interfaces.ISell;

import java.lang.String;

public class Instrument extends Shop implements ISell {

  private String section;
  private String brand;
  
 

  public Instrument(int stock, double cost, double sellingPrice, double markUp, String section, String brand){
      super(stock, cost, sellingPrice, markUp);
      this.section = section;
      this.brand = brand;


  }


  public String getSection() {
        return section;
    }

    public String getBrand() {
        return brand;
    }

    public double calculateMarkUp(double cost, double sellingPrice) {
      markUp = sellingPrice-cost;
        return markUp;
    }

    public int totalStock(int stock){
        return getStock();
    }


}
