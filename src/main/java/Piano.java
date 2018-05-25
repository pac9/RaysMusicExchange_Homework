import interfaces.IPlay;

import java.lang.String;

public class Piano implements IPlay {

    private int key;
    private int string;

    public Piano(int key, int string) {
        this.key = key;
        this.string = string;
    }

    public String play(String sound) {

        return "I make the sound: " + sound;
    }

    public int getKeys() {
        return key;
    }

    public int getStrings() {
        return string;
    }
}
