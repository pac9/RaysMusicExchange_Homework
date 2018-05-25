import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar();
    }

    @Test
    public void canPlay() {
        assertEquals("I make the sound: pingping", guitar.play("pingping"));
    }
}
