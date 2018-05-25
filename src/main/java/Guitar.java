import interfaces.IPlay;

import java.lang.String;

public class Guitar extends Instrument implements IPlay {

    private int strings;

    public Guitar(String section, String brand, int strings){
        super(section, brand);
        this.strings = strings;
    }

    public int getStrings(){
        return this.strings;
    }

    public String play(String sound) {
        return "I make the sound: " + sound;
    }
}
