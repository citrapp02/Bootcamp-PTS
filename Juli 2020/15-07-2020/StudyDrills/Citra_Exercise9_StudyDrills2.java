import java.util.Scanner;

public class Citra_Exercise9_StudyDrills2 {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double feet, inches, pounds, hf, hi, kg, bmi;

        System.out.print( "Your height in feet: " );
        feet = keyboard.nextDouble();

        System.out.print( "Your height in inches: " );
        inches = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: " );
        pounds = keyboard.nextDouble();

        kg = pounds*0.453592; 
        hf = feet*0.3048;
        hi = inches*0.0254;
        bmi = kg / ((hf+hi)*(hf+hi));
        System.out.println( "Your BMI is " + bmi );
    }
}