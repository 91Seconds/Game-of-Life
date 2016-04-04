import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kingciar1 on 4/04/16.
 */
public class CellTest {

    @Test
    public void isDead()    {
        Cell deadCell = new Cell(false);
        assertTrue(deadCell.isLive==false);
    }
    @Test
    public void isLive()    {
        Cell newCell = new Cell(true);
        assertTrue(newCell.isLive==true);
    }

}