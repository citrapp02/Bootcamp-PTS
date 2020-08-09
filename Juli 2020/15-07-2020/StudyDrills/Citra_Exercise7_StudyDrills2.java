import java.util.Scanner;

public class Citra_Exercise7_StudyDrills2 {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "What city is the capital of France?" );
        keyboard.next();

        System.out.println( "What is 6 multiplied by 7?" );
        keyboard.nextInt();

        System.out.println( "Enter a number between 0.0 and 1.0." );
        keyboard.nextDouble();

        System.out.println( "Is there anything else you would like to say?" );
        keyboard.next();
    }
}
//xd
// Exception in thread "main" java.util.InputMismatchException
//         at java.util.Scanner.throwFor(Unknown Source)
//         at java.util.Scanner.next(Unknown Source)
//         at java.util.Scanner.nextDouble(Unknown Source)
//         at Citra_Exercise7_StudyDrills2.main(Citra_Exercise7_StudyDrills2.java:14)