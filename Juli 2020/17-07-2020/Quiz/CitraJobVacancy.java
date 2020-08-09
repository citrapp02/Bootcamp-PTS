import java.util.Scanner;

public class CitraJobVacancy {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name, gender, graduate;
        int age, experience;
        double height, appearance;
        boolean coordinatorrequirement, maleadminrequirement, femaleadminrequirement;

        System.out.print( "Enter your name: \t" );
        name = keyboard.next();
        
        System.out.print( "Enter your age: \t" );
        age = keyboard.nextInt();

        System.out.print( "Enter your graduate level (SMA/SMK/D3/S1): \t" );
        graduate = keyboard.next();

        System.out.print( "Enter your gender (Male/Female)\t :" );
        gender = keyboard.next();

        System.out.print( "Enter your experience (years)\t :" );
        experience = keyboard.nextInt();

        System.out.print( "Enter height\t: " );
        height = keyboard.nextDouble();

        System.out.print( "Enter your appearance (1-10)\t:" );
        appearance = keyboard.nextDouble();

        coordinatorrequirement = (gender.equals("male") && ((age >= 25 && age <= 30) || (age > 30 && experience > 5)) && (( graduate.equals("s1") && experience >= 0) || (( graduate.equals("smk") || graduate.equals("d3")) && experience >= 2)));
        System.out.println( "Requirements for Coordinator: " + coordinatorrequirement);

        maleadminrequirement = (gender.equals("male") && (((age >= 20 && age < 30) && (appearance >= 8.5) && (height >= 165)) || (( graduate.equals("d3") || graduate.equals("s1")) && (experience >= 1))));
        System.out.println( "Requirements for Male Admin: " + maleadminrequirement);

        // femaleadminrequirement = 
        // (gender.equals("female")) && ((age >= 20 && age <= 25) && (((graduate.equals("d3") && appearance >= 8.5) || height = 165 || ((graduate.equals("d3")&&experience>=1))) || (age >= 25 && (graduate.equals("s1")) && appearance >= 8.5 && experience >= 2)));
        // femaleadminrequirement = ((gender.equals("female")) && (age >= 20 && <= 25) && ((graduate.equals("d3") &&  appearance >= 8.5)||(height >= 165 || (graduate.equals("d3") && experience > 1)) || ((age >= 25 && graduate.equals("s1")) && appearance >= 8.5 && experience > 2)));
        // System.out.println( "Requirements for Female Admin: " + femaleadminrequirement);
    }
}