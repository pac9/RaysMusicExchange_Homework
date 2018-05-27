import interfaces.IPlay;
import interfaces.ISell;

import java.lang.String;

public class Piano extends Instrument implements IPlay, ISell {

    private int key;
    private int string;

    public Piano(int stock, double cost, double sellingPrice, double markUp, String section, String brand, int key, int string) {
        super(stock, cost, sellingPrice, markUp, section, brand);
        this.key = key;
        this.string = string;
    }

    public int getKeys() {
        return key;
    }

    public int getStrings() {
        return string;
    }

    public String play(String sound) {
        return "I make the sound: " + sound;
    }

    public double calculateMarkUp(double cost, double sellingPrice) {
        markUp = sellingPrice - cost;
        return markUp;
    }

    public int totalStock(int stock){
        return getStock();
    }
}
