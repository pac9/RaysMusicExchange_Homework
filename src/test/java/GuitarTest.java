import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(12, 200.00, 450.00,"Guitar", "Fender", 4);
    }

    @Test
    public void hasStrings(){
        assertEquals(4, guitar.getStrings());
    }

    @Test
    public void hasSection(){
        assertEquals("Guitar", guitar.getSection());
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canPlaySound() {
        assertEquals("I make the sound: pingping", guitar.play("pingping"));
    }

    @Test
    public void hasStock(){
        assertEquals(12, guitar.getStock());
    }

    @Test
    public void hasCost(){
        assertEquals(200.00, guitar.getCost(), 0.01);
    }

    @Test
    public void hasSellingCost(){
        assertEquals(450.00, guitar.getSellingPrice(), 0.01);
    }
}
