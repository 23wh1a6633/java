import java.util.Scanner;

public class SavingsAccount 
{
    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) 
    {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() 
    {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) 
    {
        annualInterestRate = newRate / 100; 
    }

    public double getSavingsBalance() 
    {
        return savingsBalance;
    }

    public static void main(String s[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial savings balance: ");
        double initialBalance = sc.nextDouble();
        SavingsAccount account = new SavingsAccount(initialBalance);

        System.out.print("Enter annual interest rate (as a percentage): ");
        modifyInterestRate(sc.nextDouble());

        account.calculateMonthlyInterest();
        System.out.printf("New savings balance after monthly interest: %.2f\n", account.getSavingsBalance());

        sc.close();
    }
}
