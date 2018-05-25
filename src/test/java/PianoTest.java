import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano();
    }

    @Test
    public void canPlay() {
        assertEquals("I make the sound: plonkplonk", piano.play("plonkplonk"));
    }
}
