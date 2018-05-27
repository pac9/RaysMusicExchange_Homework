import interfaces.ISell;

import java.lang.String;

public class SheetMusic extends Shop implements ISell {

    private String title;


    public SheetMusic(int stock, double cost, double sellingPrice, double markUp, String title){
        super(stock, cost, sellingPrice, markUp);
        this.title = title;
    }


    public String getTitle() {
        return this.title;
    }

    public double calculateMarkUp(double cost, double sellingPrice) {
        markUp = sellingPrice - cost;
        return markUp;
    }
}
