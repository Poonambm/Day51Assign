import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>str = new ArrayList<String>();
            // Accept the multiple string from the user
        System.out.println("Enter multiple Strings: ");
        while(true){
            String str1 = scanner.nextLine();
            if (str1.isEmpty()){
                break;
            }
            // Add user input string to the arraylist
            str.add(str1);
            }
            System.out.println("The last item in the list is: " + str.get(str.size()-1));
        }
    }