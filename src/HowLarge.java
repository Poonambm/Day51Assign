import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        System.out.println("Enter multiple Strings: ");
        while(true){
            String str1 = scanner.nextLine();
            if (str1.isEmpty()){
                break;
            }
            // Add user input string to the arraylist
            str.add(str1);
            }
            System.out.println("The total amount of items in the list was: " + str.size());
        }
    }