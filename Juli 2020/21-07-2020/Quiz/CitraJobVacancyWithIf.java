import java.util.Scanner;

public class CitraJobVacancyWithIf {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name, gender, graduate, applied;
        int age, experience;
        double height, appearance;
        boolean coordinatorrequirement, maleadminrequirement, femaleadminrequirement, spv;

        System.out.print( "Enter your name: \t\t\t\t" );
        name = keyboard.next();
        
        System.out.print( "Enter your age: \t\t\t\t" );
        age = keyboard.nextInt();

        System.out.print( "Enter your graduate level (SMA/SMK/D3/S1): \t" );
        graduate = keyboard.next();

        System.out.print( "Enter your gender (Male/Female): \t\t" );
        gender = keyboard.next();

        System.out.print( "Enter your experience (years) :\t\t\t" );
        experience = keyboard.nextInt();

        System.out.print( "Enter height :\t\t\t\t\t" );
        height = keyboard.nextDouble();

        System.out.print( "Enter your appearance (1-10) :\t\t\t" );
        appearance = keyboard.nextDouble();
        
        System.out.print( "Applied position (SPV, admin or coordinator) :\t\t\t" );
        applied = keyboard.next();

        System.out.println( name + ", thank you for joining the recruitment from PT. Secret Semut. And Applied as " + applied);     
        System.out.println("Following Results from Recruitment:");
        if (gender.equals("male") && ((age >= 21 && age <= 30) && ((graduate.equals("smk") || graduate.equals("d3") || graduate.equals("s1") && experience >= 2) || ((age >= 30 && experience >= 5))))) {
            System.out.println("Congratulations, "+ name +". You qualify for a "+ applied +" position.");
        }
        else if (gender.equals("male") && (((age >= 20 && age < 30) && appearance >= 8.5 && height >= 165) || ((graduate.equals("d3") || graduate.equals("s1") && experience >= 1)))) {
            System.out.println("Congratulations, "+ name +". You qualify for a "+ applied +" position.");
        }
        else if (gender.equals("female") && (((age >= 20 && age <= 25) && ((graduate.equals("d3") && appearance >= 8.5) || height >= 165 || (graduate.equals("d3") && experience >= 1))) || (age > 25 && graduate.equals("s1") && appearance >= 8.5 && experience >= 2))) {
            System.out.println("Congratulations, "+ name +". You qualify for a "+ applied +" position.");
        }
        else if ((gender.equals("female") || gender.equals("male")) && (age >= 23 && age <= 30) && ((graduate.equals("s1") && experience >= 1) || (graduate.equals("d3") && experience >= 3))) {
            System.out.println("Congratulations, "+ name +". You qualify for a "+ applied +" position.");
        }
        else {
            System.out.println("Sorry, "+  name +". You do not qualify for a "+ applied +" position.");
        }
        


    }
}