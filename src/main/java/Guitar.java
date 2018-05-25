import interfaces.IPlay;

import java.lang.String;

public class Guitar implements IPlay {

    private int strings;

    public Guitar(int strings){
        this.strings = strings;
    }

    public int getStrings(){
        return this.strings;
    }

    public String play(String sound) {

        return "I make the sound: " + sound;
    }
}
