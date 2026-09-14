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

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
