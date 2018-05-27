import interfaces.IPlay;
import interfaces.ISell;

import java.lang.String;

public class Saxophone extends Instrument implements IPlay, ISell {
    
    private int reed;
    
    public Saxophone(int stock, double cost, double sellingPrice, double markUp, String section, String brand, int reed){
        super(stock, cost, sellingPrice, markUp, section, brand);
        this.reed = reed;
    }

    public int getReed() {
        return reed;
    }
    
    public String play(String sound) {
    return "I make the sound: " + sound;
     }

    public double calculateMarkUp(double cost, double sellingPrice) {
        markUp = sellingPrice - cost;
        return markUp;
    }


}
