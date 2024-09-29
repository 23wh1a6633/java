import java.util.*;

public class IntegerDivision 
{
    public static void main(String s[])
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.print("Enter the first number : ");
            String inputNum1 = scanner.nextLine();
            int num1 = Integer.parseInt(inputNum1); 
            System.out.print("Enter the second number : ");
            String inputNum2 = scanner.nextLine();
            int num2 = Integer.parseInt(inputNum2); 
            if (num2 == 0) 
            {
                throw new ArithmeticException("Cannot divide by zero."); 
            }

            double result = (double) num1 / num2; 
            System.out.printf("Result: %.2f%n", result); 
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: Please enter valid integers. " + e.getMessage());
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        finally 
        {
            scanner.close(); 
        }
    }
}