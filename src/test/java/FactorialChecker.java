import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialChecker
{
    @Test
    public void IfNumberIsZeroReturnOne()
    {
        Factorial fact = new Factorial(0);
        int toFact = fact.factorial();
        assertEquals(toFact,1);
    }

    @Test
    public void IfNumberIsOneReturnOne()
    {
        Factorial fact = new Factorial(1);
        int toFact = fact.factorial();
        assertEquals(toFact,1);
    }

    @Test
    public void FactorialOfNumber()
    {
        Factorial fact = new Factorial(5);
        int toFact = fact.factorial();
        assertEquals(toFact,120);
    }


}
