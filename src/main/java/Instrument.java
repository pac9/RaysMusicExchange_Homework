import java.lang.String;

public class Instrument extends Shop {

  private String section;
  private String brand;
  
 

  public Instrument(int stock, double cost, double sellingPrice, String section, String brand){
      super(stock, cost, sellingPrice);
      this.section = section;
      this.brand = brand;
  }


  public String getSection() {
        return section;
    }

    public String getBrand() {
        return brand;
    }
}
