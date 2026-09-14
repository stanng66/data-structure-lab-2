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
public class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double parmRadius, String parmColor) {
        this.radius = parmRadius;
        this.color=parmColor;
    }

    public String getColor() {
        return color;
    }

    // The Area of a shape is calculated through the following formulas:
    // Circle = 3.14 * R * R
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        // return "Circle - Color: " + color + ", Area: " + getArea();
        return String.format("Circle - Color: %s, Area: %.2f", color, getArea());
    }
}
