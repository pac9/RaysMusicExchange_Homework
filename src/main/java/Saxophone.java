import interfaces.IPlay;

import java.lang.String;

public class Saxophone implements IPlay {
    
    private int reed;
    
    public Saxophone(int reed){
        this.reed = reed;
    }

    public int getReed() {
        return reed;
    }
    
    public String play(String sound) {
    return "I make the sound: " + sound;
     }


}
