// import java.util.Scanner;

// class Figure{
//     protected String figureName;
//     Figure(String figureName){
//         this.figureName = figureName;
//     }
//     public double calculateArea(){
//         return 0;
//     }
    
//     public void setfigureName(String figureName) {
//         this.figureName = figureName;
//     }
//     public String getfigureName() {
//         return figureName;
//     }
// }

// class Triangle extends Figure{
//     private int base;
//     private int height;
//     Triangle(int base,int height){
//         super("Triangle");
//         this.base = base;
//         this.height = height;
//     }
//     public double calculateAreaTriangle(){
//         return 0.5 * this.base * this.height;
//     }
//     public void setbase(int base) {
//         this.base = base;
//     }
//     public void setheight(int height) {
//         this.height = height;
//     }
//     public int getbase() {
//         return base;
//     }
//     public int getheight() {
//         return height;
//     }
// }

// class Rectangle extends Figure{
//     private int length;
//     private int breadth;
//     Rectangle(int length,int breadth){
//         super("Rectangle");
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public double calculateAreaRectangle(){
//        return this.length * this.breadth;
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


// class Preperation2{
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("1. Rectangle");
//         System.out.println("2. Triangle");
//         int n = sc.nextInt();
//         System.out.println("Area Calculator " + n);

//         switch (n) {
//             case 1:
//                 System.out.println("Enter length and breadth : ");
//                 Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());
//                 double areaRectangle = rectangle.calculateAreaRectangle();
//                 System.out.println("Area of Rectangle is : " + areaRectangle);
//                 break;
//             case 2:
//                 System.out.println("Enter Base and Height : ");
//                 Triangle triangle = new Triangle(sc.nextInt(),sc.nextInt());
//                 double areaTriangle = triangle.calculateAreaTriangle();
//                 System.out.println("Area of Triangle is : " + areaTriangle);
//                 break;
//         }
//     }

// }


 