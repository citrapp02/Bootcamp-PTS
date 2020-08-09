import java.util.Scanner;

public class CitraCentstoDollarsConversion {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int cents, dollars, modulusdollars;

        System.out.print( "Input the cents\t: \t"  );
        cents = keyboard.nextInt();

        dollars = cents/100;
        modulusdollars = cents%100;
        System.out.print( "That is " + dollars + " dollars and " + modulusdollars + " cents.");
    }
}
