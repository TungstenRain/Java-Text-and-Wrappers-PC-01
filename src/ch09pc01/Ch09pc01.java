package ch09pc01;
import java.util.Scanner;

/**
 * Backward String
 * Reverse a string input by the user
 */
public class Ch09pc01 {
    /**
     * Main method
     * @param args String[] The command line arguments 
     */
    public static void main(String[] args) {
        // Variables
        String str;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request user input
        System.out.print("Please enter a string: ");
        str = keyboard.nextLine();
        
        // Call method to reverse the String
        System.out.println("Your string backwards is: " + reverseString(str));
        System.out.println("Your string backwards is: " + reverseString2(str));
    }
    
    /**
     * Reverse a string of text
     * @param input String The string to be reversed
     * @return String The reversed string
     */
    public static String reverseString(String input)
    {
        char[] in = input.toCharArray();
        int begin = 0, end = in.length - 1;
        char temp;
        
        while (begin < end) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
    
    /**
     * Another method to reverse string input using StringBuilder
     * @param input String The string to be reversed
     * @return String The reversed string
     */
    public static String reverseString2(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
