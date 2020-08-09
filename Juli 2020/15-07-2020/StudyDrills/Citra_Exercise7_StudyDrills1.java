import java.util.Scanner;

public class Citra_Exercise7_StudyDrills1 {
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
//The 2nd question blows up when I type x and 233456675687908
//errror massages
//Exception in thread "main" java.util.InputMismatchException: For input string: "233456675687908"
// at java.util.Scanner.nextInt(Unknown Source)
// at java.util.Scanner.nextInt(Unknown Source)
// at Citra_Exercise7_StudyDrills1.main(Citra_Exercise7_StudyDrills1.java:11)