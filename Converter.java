import java.util.Scanner;

abstract class ConverterBase 
{
    abstract void convert();
}

class CurrencyConverter extends ConverterBase 
{
    void convert() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Converter:");
        System.out.println("1. Dollar to INR");
        System.out.println("2. INR to Dollar");
        System.out.print("Choose conversion type (1-2): ");
        int choice = scanner.nextInt();
        
        double amount, convertedAmount;

        if (choice == 1) { 
            System.out.print("Enter amount in Dollar: ");
            amount = scanner.nextDouble();
            convertedAmount = amount * 83.0; 
            System.out.println(amount + " Dollar = " + convertedAmount + " INR");
        } else if (choice == 2) { 
            System.out.print("Enter amount in INR: ");
            amount = scanner.nextDouble();
            convertedAmount = amount / 83.0; 
            System.out.println(amount + " INR = " + convertedAmount + " Dollar");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

class DistanceConverter extends ConverterBase {
    void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distance Converter:");
        System.out.println("1. Meter to KM");
        System.out.println("2. KM to Meter");
        System.out.print("Choose conversion type (1-2): ");
        int choice = scanner.nextInt();

        double distance, convertedDistance;

        if (choice == 1) { 
            System.out.print("Enter distance in meters: ");
            distance = scanner.nextDouble();
            convertedDistance = distance / 1000;
            System.out.println(distance + " meters = " + convertedDistance + " KM");
        } else if (choice == 2) {
            System.out.print("Enter distance in KM: ");
            distance = scanner.nextDouble();
            convertedDistance = distance * 1000;
            System.out.println(distance + " KM = " + convertedDistance + " meters");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

class TimeConverter extends ConverterBase {
    void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time Converter:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.print("Choose conversion type (1-2): ");
        int choice = scanner.nextInt();

        double time, convertedTime;

        if (choice == 1) { 
            System.out.print("Enter time in hours: ");
            time = scanner.nextDouble();
            convertedTime = time * 60;
            System.out.println(time + " hours = " + convertedTime + " minutes");
        } else if (choice == 2) {
            System.out.print("Enter time in minutes: ");
            time = scanner.nextDouble();
            convertedTime = time / 60;
            System.out.println(time + " minutes = " + convertedTime + " hours");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterBase converter = null;

        System.out.println("Select Converter:");
        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                converter = new CurrencyConverter();
                break;
            case 2:
                converter = new DistanceConverter();
                break;
            case 3:
                converter = new TimeConverter();
                break;
            default:
                System.out.println("Invalid choice.");
                return; // Exit the program if the choice is invalid
        }

        converter.convert(); // Call the convert method
        scanner.close();
    }
}
