import java.lang.String;

public class SheetMusic extends Shop {

    private String title;


    public SheetMusic(int stock, double cost, double sellingPrice, String title){
        super(stock, cost, sellingPrice);
        this.title = title;
    }


    public String getTitle() {
        return this.title;
    }
}
