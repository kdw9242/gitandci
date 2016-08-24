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
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testSubtract()
    {
        Calc c = new Calc();
        assertEquals( "10", c.subtract(20,10)+"" );
    }
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testMult()
    {
        Calc c = new Calc();
        assertEquals( "200", c.mult(20,10)+"" );
    }
}
