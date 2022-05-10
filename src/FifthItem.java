import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create a list that stores Strings
        ArrayList<String> str = new ArrayList<String>();

        // Accept the multiple string from the user
        System.out.println("Enter multiple strings");
        while (true) {
            // The string provided by the user will be assigned to the str variable
            // Scanner will read the input entered by the user
            String str1 = scanner.nextLine();
            if (str1.isEmpty()) {
                break;
            }
            // Add user input string to the arraylist
            str.add(str1);
        }
        System.out.println("The fifth item in the list is: " + str.get(4));
    }
}