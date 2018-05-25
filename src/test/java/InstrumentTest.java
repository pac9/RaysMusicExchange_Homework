import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("Woodwind", "Yamaha");
    }

    @Test
    public void hasSection(){
        assertEquals("Woodwind", instrument.getSection());
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", instrument.getBrand());
    }


}
