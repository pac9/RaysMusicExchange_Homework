import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(4, 300.00, 500.00, 200.00,"Woodwind", "Yamaha", 1);
    }

    @Test
    public void hasReed(){
        assertEquals(1, saxophone.getReed());
    }

    @Test
    public void hasSection(){
        assertEquals("Woodwind", saxophone.getSection());
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", saxophone.getBrand());
    }

    @Test
    public void canPlaySound() {
        assertEquals("I make the sound: whee", saxophone.play("whee"));
    }

    @Test
    public void hasStock(){
        assertEquals(4, saxophone.getStock());
    }

    @Test
    public void hasCost(){
        assertEquals(300.00, saxophone.getCost(), 0.01);
    }

    @Test
    public void hasSellingCost(){
        assertEquals(500.00, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        double result = saxophone.calculateMarkUp(saxophone.getCost(), saxophone.getSellingPrice());
        assertEquals(200.00, result, 0.01);
    }

}
