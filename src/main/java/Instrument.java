import java.lang.String;

public class Instrument {

  private String section;
  private String brand;
  
 

  public Instrument(String section, String brand){
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
