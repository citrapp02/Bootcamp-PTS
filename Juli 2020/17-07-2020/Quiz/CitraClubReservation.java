import java.util.Scanner;

public class CitraClubReservation {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name, gender;
        int age;
        double attractive, money;
        boolean mondayreservation, tuesdayreservation, wednesdayreservation, thursdayreservation, frydayreservation, saturdayandsundayreservation;

        System.out.print( "Welcome To Reservation Club\nPlease insert your Name?: \t\t" );
        name = keyboard.next();
        
        System.out.print( "How old are you? \t\t" );
        age = keyboard.nextInt();

        System.out.print( "What is your gender? \t\t" );
        gender = keyboard.next();

        System.out.print( "How attractive are you? (1 to 10)\t" );
        attractive = keyboard.nextDouble();

        System.out.print( "How much money do you have?\t\t" );
        money = keyboard.nextDouble();

        System.out.println( "\nHi " + name + ", Thank you for using our Application.\nFollowing Results for your Reservation:");

        mondayreservation = (age >= 20 && age <= 30) && (gender.equals("male") || gender.equals("female")) && (money >= 500);
        System.out.println( "Reservation for Monday :\t " + mondayreservation);

        tuesdayreservation = (age >= 31 && age <= 50) && (gender.equals("male") || gender.equals("female")) && (money >= 250);
        System.out.println( "Reservation for Tuesday :\t " +  tuesdayreservation);

        wednesdayreservation = (age >=20 && age <= 35) && (gender.equals("female")) && (attractive > 8) && (money >= 300);
        System.out.println( "Reservation for Wednesday :\t " +  wednesdayreservation);

        thursdayreservation = (age >=21 && age <= 30) && ((gender.equals("male") && money > 1000) || (gender.equals("female") && attractive>8));
        System.out.println( "Reservation for Thursday :\t " +  thursdayreservation);
        
        frydayreservation = ((gender.equals("male") && attractive > 8 && (age >= 21 && age <= 25)) || (gender.equals("female") && (age >= 31 && age <= 45)));
        System.out.println( "Reservation for Fryday :\t " +  frydayreservation);
        
        saturdayandsundayreservation = (age >= 18 && age <= 60);
        System.out.println( "Reservation for Saturday and Sunday :\t " +  saturdayandsundayreservation);
    }
}