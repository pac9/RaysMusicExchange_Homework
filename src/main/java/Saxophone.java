import interfaces.IPlay;

import java.lang.String;

public class Saxophone extends Instrument implements IPlay {
    
    private int reed;
    
    public Saxophone(String section, String brand, int reed){
        super(section, brand);
        this.reed = reed;
    }

    public int getReed() {
        return reed;
    }
    
    public String play(String sound) {
    return "I make the sound: " + sound;
     }


}
