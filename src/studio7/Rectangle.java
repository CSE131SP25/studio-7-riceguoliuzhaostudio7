package studio7;

public class Rectangle {

    // Instance variables
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Method to get area
    public double area() {
        return length * width;
    }

    // Method to get perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // Method to compare area with another rectangle
    public boolean isSmallerThan(Rectangle other) {
        return this.area() < other.area();
    }

    // Method to check if the rectangle is a square
    public boolean isSquare() {
        return width == length;
    }

    // Main method for testing
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7, 5);
        Rectangle r2 = new Rectangle(4, 4);

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is Square: " + r1.isSquare());
        System.out.println("Is r1 smaller than r2? " + r1.isSmallerThan(r2));

      
    }
}
	

