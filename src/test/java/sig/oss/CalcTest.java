package sig.oss;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class CalcTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAdd()
    {
        Calc c = new Calc();
        assertEquals( "30", c.add(10,20)+"" );
    }
}
