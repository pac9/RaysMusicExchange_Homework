import java.lang.String;

public class Saxophone { 
    
    private int reed;
    
    public Saxophone(int reed){
        this.reed = reed;
    }
    
    
    
    public String play(String sound) {
    return "I make the sound: " + sound;
     }

    public int getReed() {
        return reed;
    }
}
