import java.util.Scanner;

class Invoice 
{

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = Math.max(quantity, 0); 
        this.pricePerItem = Math.max(pricePerItem, 0.0); 
    }

    public double getInvoiceAmount() 
    {
        return quantity * pricePerItem;
    }

    public void displayInvoice() 
    {
        System.out.println("\nInvoice:");
        System.out.println("Number: " + partNumber);
        System.out.println("Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + pricePerItem);
        System.out.println("Total Invoice Amount: " + getInvoiceAmount());
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String partNumber = scanner.nextLine();

        System.out.print("Enter Description: ");
        String partDescription = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Price per Item: ");
        double pricePerItem = scanner.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        invoice.displayInvoice();

        scanner.close();
    }
}
