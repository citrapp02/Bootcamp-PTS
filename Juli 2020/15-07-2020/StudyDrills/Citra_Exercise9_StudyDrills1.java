import java.util.Scanner;

public class Citra_Exercise9_StudyDrills1 {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double inches, pounds, m, kg, bmi;

        System.out.print( "Your height in inches: " );
        inches = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: " );
        pounds = keyboard.nextDouble();

        kg = pounds*0.453592; 
        m = inches*0.0254;
        bmi = kg / (m*m);
        System.out.println( "Your BMI is " + bmi );
    }
}