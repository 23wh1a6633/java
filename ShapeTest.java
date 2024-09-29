import java.util.Scanner;

abstract class Shape 
{
    int a; 
    int b;
    abstract void printArea();
}

class Rectangle extends Shape 
{
    void printArea() 
    {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape 
{
    void printArea() 
    {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape 
{
    void printArea() 
    {
        double area = Math.PI * a * a;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeTest 
{
    public static void main(String s[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();

        switch (choice) 
        {
            case 1:
                Rectangle rectangle = new Rectangle();
                System.out.print("Enter length of Rectangle : ");
                rectangle.a = scanner.nextInt();
                System.out.print("Enter width of Rectangle : ");
                rectangle.b = scanner.nextInt();
                rectangle.printArea();
                break;

            case 2: 
                Triangle triangle = new Triangle();
                System.out.print("Enter base of Triangle : ");
                triangle.a = scanner.nextInt();
                System.out.print("Enter height of Triangle : ");
                triangle.b = scanner.nextInt();
                triangle.printArea();
                break;

            case 3: 
                Circle circle = new Circle();
                System.out.print("Enter radius of Circle (a): ");
                circle.a = scanner.nextInt(); 
                circle.printArea();
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}