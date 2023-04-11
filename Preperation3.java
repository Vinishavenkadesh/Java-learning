import java.util.Scanner;

abstract class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract float calculateArea();
}

class Circle extends Shape {

    private int radius;

    Circle(String name, int radius) {
        super("Circle");
        this.name = name;
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    float calculateArea() {
        float AreaOfCircle = (float) (3.14 * this.radius * this.radius);
        return AreaOfCircle;
    }
}

class Square extends Shape {
    private int side;

    Square(String name, int side) {
        super("Square");
        this.name = name;
        this.side = side;

    }

    @Override
    float calculateArea() {
        float AreaOfSquare = (float) (side * side);
        return AreaOfSquare;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    public int getSide() {
        return side;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    Rectangle(String name, int length, int breadth) {
        super("Rectangle");
        this.name = name;
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    float calculateArea() {
        float areaOfRectangle = length * breadth;
        return areaOfRectangle;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle");
        System.out.println("Square");
        System.out.println("Rectangle");
        System.out.println("Enter the shape name:");
        float area;
        String n = sc.nextLine();
        switch (n) {
            case "Circle":
                System.out.println("Enter the radius : ");
                Circle circle = new Circle("Circle", sc.nextInt());
                area = circle.calculateArea();
                System.out.println("Area of Circle is " + String.format("%.2f", area));
                break;
            case "Square":
                System.out.println("Enter the side : ");
                Square square = new Square("Square", sc.nextInt());
                area = square.calculateArea();
                System.out.println("Area of Square is " + String.format("%.2f", area));
                break;
            case "Rectangle":
                System.out.println("Enter the shape name : ");
                Rectangle rectangle = new Rectangle("Rectangle", sc.nextInt(), sc.nextInt());
                area = rectangle.calculateArea();
                break;

        }

    }
}
