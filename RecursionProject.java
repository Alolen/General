/**
This program returns a string, but converts all the X's to Y's recursively.
*/
package recursionproject;
import java.util.Scanner;
public class RecursionProject {
/**
Description: Driver method. This is where the magic happens; main calls all the various methods used in the program.
@param N/A
@return N/A
@throws N/A
*/
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input a word.");
        String word = scnr.next();
        System.out.println(changeXY(word));
    }
/**
Description: changeXY method calls itself recursively, changing each character that is an x, letter by letter.
@param N/A
@return String word
@throws N/A
*/
    public static String changeXY(String word)
    {
        if (word.length() == 0) 
        {
            System.out.println("Base case");
            return "";
        }
        else
        {
            char firstLetter = word.charAt(0);
            word = word.substring(1);
            if (firstLetter == 'x')
            {
                System.out.println("changing the y to an x");
                return 'y' + changeXY(word);
            }
            else
            {
                System.out.println("changing nothing");
                return firstLetter + changeXY(word);
            }
        }
    }
}
