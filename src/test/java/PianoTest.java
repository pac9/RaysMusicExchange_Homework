import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(5, 600.00,1100.00,"Piano", "Yamaha",88, 230);
    }

    @Test
    public void hasKeys(){
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void hasStrings(){
        assertEquals(230, piano.getStrings());
    }

    @Test
    public void hasSection(){
        assertEquals("Piano", piano.getSection());
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void canPlaySound() {
        assertEquals("I make the sound: plonkplonk", piano.play("plonkplonk"));
    }

    @Test
    public void hasStock(){
        assertEquals(5, piano.getStock());
    }

    @Test
    public void hasCost(){
        assertEquals(600.00, piano.getCost(), 0.01);
    }

    @Test
    public void hasSellingCost(){
        assertEquals(1100.00, piano.getSellingPrice(), 0.01);
    }
}
