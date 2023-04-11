
//arr->get
//reverse 
import java.util.*;

public class arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrReverse = new ArrayList<>();
        System.out.println("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(("Enter the numbers : "));
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Reversed String is : ");
        for (int i = n-1; i >= 0; i--) {
           arrReverse.add(arr.get(i));
        }
        System.out.println(arrReverse);
        for(int i = 0;i<arrReverse.size();i++){
            System.out.println(arrReverse.get(i));
        }
    }
}
