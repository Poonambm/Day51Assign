import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        ArrayList<Integer> number1 = new ArrayList<Integer>();
            // Accept multiple numbers from the user
        System.out.print("Enter multiple nunbers: ");
        while (true) {
            Integer int1 = sc.nextInt();
            // Add user input numbers to the arraylist
            number1.add(int1);
            if (int1 == 0) {
                break;
            }
        }
        System.out.println("Done entering integers into the list");
        System.out.println(number1);
        System.out.println("What number are you looking for in the list?");
        Integer int2 = sc.nextInt();
        System.out.println(int2 + " is at index of " + number1.indexOf(int2));
    }
}
