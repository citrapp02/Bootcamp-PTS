import java.util.Scanner;

public class Citra_Exercise13_Example {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        boolean yep, nope;

        System.out.println( "Type the word \"weasel\", please");
        word = keyboard.next();
        
        yep =  word.equals("weasel");
        nope = ! word.equals("weasel");
        
        System.out.println( "You type what was requested: " + yep);
        System.out.println( "You ignored polite instructions: " + nope);
    }
}