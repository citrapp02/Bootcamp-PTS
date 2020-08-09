import java.util.Scanner;

public class Citra_Exercise8_StudyDrills4 {
    public static void main( String[] args ) {
        String name, mother;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();
        
        System.out.print( "Can I ask your mother's name? " );
        mother = keyboard.next();
        System.out.println( "So, your mother's name is "+mother+" right ?. Such beautiful name." );

        System.out.println( "So you're " + age + ", eh? That's not very old." );
        System.out.print( "How much do you weigh, " + name + "? " );
        weight = keyboard.nextDouble();

        System.out.println( weight + "! Better keep that quiet!!" );
        System.out.print("Finally, what's your income, " + name + "? " );
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!" );
        System.out.print( "Well, thanks for answering my rude questions, " );
        System.out.println( name + "." );
    }
}
//tidak