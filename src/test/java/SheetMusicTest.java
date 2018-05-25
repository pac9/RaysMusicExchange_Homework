import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(24, 12.00, 20.00, "Abba's Greatest Hits");
    }

    @Test
    public void hasStock(){
        assertEquals(24, sheetMusic.getStock() );
    }

    @Test
    public void hasCost(){
        assertEquals(12.00, sheetMusic.getCost(), 0.01);

    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20.00, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void hasTitle(){
        assertEquals("Abba's Greatest Hits", sheetMusic.getTitle());
    }

}
