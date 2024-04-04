class Shape {
  public void area() {
    System.out.println("Area calculation for generic shape");
  }
}

class Square extends Shape {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override // Optional annotation to indicate overriding
  public void area() {
    System.out.println("Area of Square: " + (side * side));
  }
}

class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public void area() {
    System.out.println("Area of Rectangle: " + (length * width));
  }
}

public class Main {
  public static void main(String[] args) {
    Shape shape = new Shape(); // Generic shape - area calculation for generic shape
    shape.area();

    Square square = new Square(5);
    square.area(); // Overridden method - Area of Square

    Rectangle rectangle = new Rectangle(4, 6);
    rectangle.area(); // Overridden method - Area of Rectangle
  }
}
