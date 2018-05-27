import interfaces.IPlay;
import interfaces.ISell;

import java.lang.String;

public class Guitar extends Instrument implements IPlay, ISell {

    private int strings;

    public Guitar(int stock, double cost, double sellingPrice, double markUp,String section, String brand, int strings){
        super(stock, cost, sellingPrice, markUp, section, brand);
        this.strings = strings;
    }

    public int getStrings(){
        return this.strings;
    }

    public String play(String sound) {
        return "I make the sound: " + sound;
    }

    public double calculateMarkUp(double cost, double sellingPrice) {
        markUp = sellingPrice - cost;
        return markUp;
    }
}
