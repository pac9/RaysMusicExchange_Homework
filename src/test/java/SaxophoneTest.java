import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(1);
    }

    @Test
    public void hasReed(){
        assertEquals(1, saxophone.getReed());
    }


    @Test
    public void canPlaySound() {
        assertEquals("I make the sound: whee", saxophone.play("whee"));
    }
}
