public class Factorial
{
    private final int n;

    public Factorial(int n)
    {
        this.n = n;
    }


    public int factorial()
    {
        int fact=1;

        if(n==0 || n==1)
            return 1;
        else
            for(int i=1;i<=n;i++)
            {
                fact*=i;
            }
            return fact;

    }
}
