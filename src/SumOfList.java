import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        ArrayList<Integer> number1 = new ArrayList<Integer>();
            // Accept the multiple numbers from the user
        System.out.print("Enter multiple nunbers: ");
        while (true) {
            Integer int1 = sc.nextInt();
                // Add user input numbers to the arraylist
            number1.add(int1);
            if (int1 == 0) {
                break;
            }
        }
        
        System.out.println(number1 + " were the items in the list");
        add(number1);

    }

    public static void add(ArrayList<Integer> num) {
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum = sum + num.get(i);
        }
        System.out.println("The sum of that list is: " + sum);

    }
}
