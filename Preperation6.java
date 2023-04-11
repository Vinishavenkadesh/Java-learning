import java.util.Scanner;
class Student{
    public String name;
    public int mark;
    Scanner sc = new Scanner(System.in);

    public float calculatePercentage(int n){
        float per = this.mark/n;
        System.out.println(per);
        return per;
    }
    public float calculateMark(int n){
      int sum = 0;
      System.out.println("");
      for(int i = 0;i<n;i++){
          int num = sc.nextInt();
          sum += num;  
      }
      System.out.println(sum);
      this.mark = sum;
      return sum;
    }
}
class preperation6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name");
        sc.nextLine();
        System.out.println("Enter the subject num");
        int ns = sc.nextInt();
        Student s1 = new Student();
         s1.calculateMark(ns);
         s1.calculatePercentage(ns);
    }
}