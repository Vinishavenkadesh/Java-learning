
//user -> n
//store list iteration
//sum all elemnt
import java.util.*;

public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of element :");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the num : ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }
        System.out.println("The sum is " + sum);
        int min = arr.get(0);
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }

        }
        System.out.println("The minimum element is : " + min);
        System.out.println("The maximum element is : " + max);
    }
}
