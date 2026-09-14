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
// Lab requirement: The program will read the order, calculate the total area of all red, green and blue shapes using the Shape interface and print out the results
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {
    /* Shape circle1 = new Circle(0.5, "blue");
    Shape circle2 = new Circle(0.2, "red");
    Shape circle3 = new Circle(1, "green");
    Shape circle4 = new Circle(1, "blue");
    Shape square1 = new Square(1, "blue");
    Shape square2 = new Square(1.5, "green");
    Shape square3 = new Square(1, "green");
    Shape square4 = new Square(2, "blue");
    Shape square5 = new Square(0.5, "red");*/

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    System.out.println("====================");
    System.out.println("Enter shapes (circle, radius, color) or (square, length, color). Type 'end' to calculate total area of all entered color shapes:");
    System.out.println("====================");

    while (true) {
      String line = scanner.nextLine();

      if (line.equalsIgnoreCase("end")) {
        break;
      }

      String[] parts = line.split(" ");

      // Check correct format
      if (parts.length != 3) {
        System.out.println("Invalid input format. Please enter in the format: shape size color");
        continue;
      }

      String type = parts[0];
      String sizeText = parts[1];
      String color = parts[2];

      // Check shape type
      if (!type.equalsIgnoreCase("circle") && !type.equalsIgnoreCase("square")) {
        System.out.println("Invalid shape type. Please enter 'circle' or 'square'.");
        continue;
      }

      // Check colour
      if (!color.equalsIgnoreCase("red") && !color.equalsIgnoreCase("green") && !color.equalsIgnoreCase("blue")) {
        System.out.println("Invalid color. Please enter 'red', 'green', or 'blue'.");
        continue;
      }

      // Check number is positive
      double size;
      try {
        size = Double.parseDouble(sizeText);
        if (size <= 0) {
          System.out.println("length/radius must be a positive number.");
          continue;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid size. Please enter a positive number.");
        continue;
      }

      // If everything is valid, create the shape
      if (type.equalsIgnoreCase("circle")) {
        shapes.add(new Circle(size, color));
      } else if (type.equalsIgnoreCase("square")) {
        shapes.add(new Square(size, color));
      }
    }

    double red = 0, green = 0, blue = 0;

    for (Shape s : shapes) {
      switch (s.getColor().toLowerCase()) {
        case "red": red += s.getArea(); break;
        case "green": green += s.getArea(); break;
        case "blue": blue += s.getArea(); break;
      }
    }

    System.out.println("====================");
    System.out.println("       Output       ");
    System.out.println("====================");
    System.out.println("Red total area: " + String.format("%.2f", red));
    System.out.println("Green total area: " + String.format("%.2f", green));
    System.out.println("Blue total area: " + String.format("%.2f", blue));
  }
}