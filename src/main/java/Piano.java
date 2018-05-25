import interfaces.IPlay;

import java.lang.String;

public class Piano extends Instrument implements IPlay {

    private int key;
    private int string;

    public Piano(String section, String brand, int key, int string) {
        super(section, brand);
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
}
