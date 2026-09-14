// ====================
// Lab 2
// Stanley Nguyen (N01570766)
// Humber College
// CPAN-211-RNA
// Mehrnaz Zhian
// September 18, 2026
// --------------------
// This program practices interfaces
// ====================
// Lab requirement: The shapes are circles and squares that can vary in size determined by their side length or radiuses in meters.
public class Square implements Shape {
    private double length;
    private String color;

    public Square(double parmLength, String parmColor) {
        this.length = parmLength;
        this.color = parmColor;
    }

    public String getColor() {
        return color;
    }

    // The Area of a shape is calculated through the following formulas:
    // Square = L * L
    public double getArea() {
        return length * length;
    }

    public String toString() {
        // return "Square - Color: " + color + ", Area: " + getArea();
        return String.format("Square - Color: %s, Area: %.2f", color, getArea());
    }
}
