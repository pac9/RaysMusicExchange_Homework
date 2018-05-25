import interfaces.IPlay;

import java.lang.String;

public class Guitar implements IPlay {

    public String play(String sound) {

        return "I make the sound: " + sound;
    }
}
