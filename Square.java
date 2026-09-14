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
public class Square implements Shape {
    private double side;
    private String color;

    public Square(double parmSide, String parmColor) {
        this.side = parmSide;
        this.color = parmColor;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return side * side;
    }
}
