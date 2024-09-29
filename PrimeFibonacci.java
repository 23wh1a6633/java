public class PrimeFibonacci 
{
    public static void main(String s[]) 
    {
        for (int i = 2; i < 100000; i++) 
        {
            if (isPrime(i) && isFibonacci(i)) 
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isFibonacci(int number) 
    {
        int a = 0;
        int b = 1;
        while (b < number) 
        {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return (b == number || number == 0);
    }
}