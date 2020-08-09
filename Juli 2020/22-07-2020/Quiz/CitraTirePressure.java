import java.util.Scanner;

public class CitraTirePressure {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int rightFront, leftFront, rightRear, leftRear, frontDifference, rearDifference;
        boolean badPressure, goodPressure;

        System.out.print( "Input rigth front pressure: \t\t" );
        rightFront = keyboard.nextInt();
        if (rightFront < 32 || rightFront > 42) {
            System.out.println("Warning: pressure is out of range!");
        }
        else{

        }
        System.out.print( "Input left front pressure: \t\t" );
        leftFront = keyboard.nextInt();
        if (leftFront < 32 || leftFront > 42) {
            System.out.println("Warning: pressure is out of range!");
        }
        else{

        }

        System.out.print( "Input right rear pressure: \t\t" );
        rightRear = keyboard.nextInt();
        if (rightRear < 35 || rightRear > 45) {
            System.out.println("Warning: pressure is out of range!");
        }
        else{

        }

        System.out.print( "Input right rear pressure: \t\t" );
        leftRear = keyboard.nextInt();
        if (leftRear < 35 || leftRear > 45) {
            System.out.println("Warning: pressure is out of range!");
        }
        else{

        }
        frontDifference = Math.abs(rightFront - leftFront) ;
        rearDifference = Math.abs(rightRear - leftRear) ;
        badPressure = rightFront < 32 || rightFront > 42 || leftFront < 32 || leftFront > 45 || rightRear < 35 || rightRear > 45 || leftRear < 35 || leftRear > 45 || frontDifference > 3 || rearDifference >5;
        
        if (badPressure) {
            System.out.print("Inflation is BAD");
        }
        else {
            System.out.print("Inflation is GOOD");
        }
        
    }
}