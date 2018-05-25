import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxaphone();
    }

    @Test
    public void canPlay() {
        assertEquals("I make the sound: whee", saxaphone.play("whee"));
    }
}
