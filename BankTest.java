abstract class Bank 
{

    abstract int getBalance();
}

class BankA extends Bank 
{

    int getBalance() 
    {
        return 10000; 
    }
}

class BankB extends Bank 
{
    int getBalance() 
    {
        return 15000; 
    }
}

class BankC extends Bank 
{

    int getBalance() 
    {
        return 20000; 
    }
}

public class BankTest 
{
    public static void main(String s[]) 
    {

        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: " + bankA.getBalance());
        System.out.println("Balance in Bank B: " + bankB.getBalance());
        System.out.println("Balance in Bank C: " + bankC.getBalance());
    }
}