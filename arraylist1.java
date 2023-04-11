import java.util.*;

public class arraylist1 {
 public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array : ");
      int a = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      System.out.println("Enter the elements : ");
      for(int i = 0;i<a;i++){ 
        arr.add(sc.nextInt());
      }
      Collections.sort(arr);
      System.out.println(arr);
 }
}
