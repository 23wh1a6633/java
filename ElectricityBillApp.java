import java.util.Scanner;

class ElectricityBill {
    // Instance variables
    private String consumerNo;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private String connectionType;

    // Constructor to initialize the instance variables
    public ElectricityBill(String consumerNo, String consumerName, double previousReading,
                           double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    // Method to compute the bill amount
    public double computeBill() {
        if (currentReading < previousReading) {
            System.out.println("Error: Current month reading cannot be less than previous month reading.");
            return 0;
        }

        double unitsConsumed = currentReading - previousReading;
        double billAmount = 0;

        // Define tariff rates based on connection type
        double domesticRate = 5.0;     // Rate per unit for domestic
        double commercialRate = 8.0;   // Rate per unit for commercial

        // Calculate the bill amount based on connection type
        if (connectionType.equalsIgnoreCase("domestic")) {
            billAmount = unitsConsumed * domesticRate;
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            billAmount = unitsConsumed * commercialRate;
        } else {
            System.out.println("Invalid connection type.");
            return 0;
        }

        return billAmount;
    }

    // Method to display the bill
    public void displayBill() {
        System.out.println("\nElectricity Bill");
        System.out.println("-----------------");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousReading);
        System.out.println("Current Month Reading: " + currentReading);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Total Bill Amount: " + computeBill());
    }
}

public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input consumer details
        System.out.print("Enter Consumer Number: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        double previousReading = scanner.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        double currentReading = scanner.nextDouble();

        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter Type of EB Connection (domestic/commercial): ");
        String connectionType = scanner.nextLine();

        // Create an ElectricityBill object
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);

        // Display the bill
        bill.displayBill();

        scanner.close();
    }
}