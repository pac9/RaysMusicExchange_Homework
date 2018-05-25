import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88, 230);
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
    public void canPlaySound() {
        assertEquals("I make the sound: plonkplonk", piano.play("plonkplonk"));
    }
}
