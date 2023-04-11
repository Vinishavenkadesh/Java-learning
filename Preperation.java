// import java.util.Scanner;

// class Shape{
//     protected String shapeName;
//     Shape(String shapeName){
//         this.shapeName = shapeName;
//     }
//     public double calculateArea(){
//         return 0;
//     }
//     public void setShapeName(String shapeName) {
//         this.shapeName = shapeName;
//     }
//     public String getShapeName() {
//         return shapeName;
//     }
// }

// class Square extends Shape{
//     private int side;
//     Square(int side){
//         super("Square");
//         this.side = side;
//     }
//     // calculateArea – calculates and returns the area of the square. The return type of this method is Double.
//     public double calculateAreaSquare(){
//         return this.side * this.side;
//     }
//     public void setSide(int side) {
//         this.side = side;
//     }
//     public int getSide() {
//         return side;
//     }
// }

// class Rectangle extends Shape{
//     private int length;
//     private int breadth;
//     Rectangle(int length,int breadth){
//         super("Rectangle");
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double calculateAreaRectangle(){
//        return this.length*this.breadth;
//     }
//     public void setBreadth(int breadth) {
//         this.breadth = breadth;
//     }
//     public void setLength(int length) {
//         this.length = length;
//     }
//     public int getBreadth() {
//         return breadth;
//     }
//     public int getLength() {
//         return length;
//     }
// }

// class Circle extends Shape{
//     private int radius;
//     Circle(int radius){
//         super("Circle");
//         this.radius = radius;

//     }

//     public double calculateAreaCircle(){
//         return 3.14 * radius *radius;
//     }
//     public void setRadius(int radius) {
//         this.radius = radius;
//     }
//     public int getRadius() {
//         return radius;
//     }
// }


// class Preperation{
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("1. Rectangle");
//         System.out.println("2. Square");
//         System.out.println("3. Circle");
//         int n = sc.nextInt();
//         System.out.println("Area Calculator" + n);

//         switch (n) {
//             case 1:
//                 System.out.println("Enter length and breadth : ");
//                 Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());
//                 double areaRectangle = rectangle.calculateAreaRectangle();
//                 System.out.println("Area of Rectangle is : " + areaRectangle);
//                 break;
//             case 2:
//                 System.out.println("Enter side : ");
//                 Square square = new Square(sc.nextInt());
//                 double AreaSquare = square.calculateAreaSquare();
//                 System.out.println("Area of Square is : " + AreaSquare);
//                 break;
//             case 3:
//             System.out.println("Enter Radius : ");
//             Circle circle = new Circle(sc.nextInt());
//             double AreaCircle = circle.calculateAreaCircle();
//             System.out.println("Area of Circle is : "+ AreaCircle);
//                 break;
//         }
//     }

 

// }