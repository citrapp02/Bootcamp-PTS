import java.util.Scanner;

public class CitraClubReservationWithIf {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name, gender, dayreservation, keterangan;
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

        System.out.print( "What day do you want to make a reservation?\t\t" );
        dayreservation = keyboard.next();

        System.out.println( "Hi " + name + ", Thank you for using our Application.\nFollowing Results for your Reservation:");
        if (dayreservation.equals("monday")) {
            keterangan = "Young Night";
            if ((age >= 20 && age <= 30) && (gender.equals("male") || gender.equals("female")) && (money >= 500)){
                System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");            
            }
            else {
                System.out.println("Sorry, you cant reserve on "+ dayreservation +". Because it is for "+ keterangan +".");
            }
        }
        else {
            if (dayreservation.equals("tuesday")) {
            keterangan = "Oldest Night";
                if ((age >= 31 && age <= 50) && (gender.equals("male") || gender.equals("female")) && (money >= 250)){
                    System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");            
                }
                else {
                    System.out.println("Sorry, you cant reserve on "+ dayreservation +". Because it is for "+ keterangan +".");
                }
            }
            else {
                if (dayreservation.equals("wednesday")){
                keterangan = "Ladies Night";
                    if ((age >=20 && age <= 35) && (gender.equals("female")) && (attractive >= 8) && (money >= 300)){
                    System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");            
                    }
                    else {
                        System.out.println("Sorry, you cant reserve on "+ dayreservation +". Because it is for "+ keterangan +".");
                    }
                }
                else {
                    if (dayreservation.equals("thursday")) {
                    keterangan = "Party Night For Single";    
                        if ((age >=21 && age <= 30) && ((gender.equals("male") && money > 1000) || (gender.equals("female") && attractive>8 && money >= 300))){
                        System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");            
                        }
                        else {
                            System.out.println("Sorry, you cant reserve on "+ dayreservation +". Because it is for "+ keterangan +".");
                        }
                    }
                    else {
                        if (dayreservation.equals("fryday")) {
                        keterangan = "Woman Night";
                            if (((gender.equals("male") && attractive > 8 && (age >= 21 && age <= 25)) || (gender.equals("female") && (age >= 31 && age <= 45) && money >= 1000))){
                            System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");            
                            }
                            else {
                                System.out.println("Sorry, you cant reserve on "+ dayreservation +". Because it is for "+ keterangan +".");
                            }
                        }
                        else {
                            if (dayreservation.equals("sunday") || dayreservation.equals("monday")) {
                            keterangan = "Weekend Freedom";
                                if (((age >= 18 && age <= 60) && money >= 100)){
                                System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");            
                                }
                                else {
                                    System.out.println("Sorry, you cant reserve on "+ dayreservation +". Because it is for "+ keterangan +".");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

        
        
//         if ((age >= 20 && age <= 30) && (gender.equals("male") || gender.equals("female")) && (money >= 500)) {
//             // keterangan = "Young Night";
            
//         }
//         else {
//             if ((age >= 31 && age <= 50) && (gender.equals("male") || gender.equals("female")) && (money >= 250)) {
//             // keterangan = "Oldest Night";
//             // System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");
//             }
//             else {
//                 if ((age >=20 && age <= 35) && (gender.equals("female")) && (attractive >= 8) && (money >= 300)) {
//                 // keterangan = "Ladies Night";
//                 // System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");
//                 }
//                 else {
//                     if ((age >=21 && age <= 30) && ((gender.equals("male") && money > 1000) || (gender.equals("female") && attractive>8 && money >= 300))) {
//                     // keterangan = "Party Night For Single";
//                     // System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");
//                     }
//                     else {
//                         if (((gender.equals("male") && attractive > 8 && (age >= 21 && age <= 25)) || (gender.equals("female") && (age >= 31 && age <= 45) && money >= 1000))) {
//                         // keterangan = "Woman Night";
//                         // System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");
//                         }
//                         else {
//                             if (((age >= 18 && age <= 60) && money >= 100)) {
//                             // keterangan = "Weekend Freedom";
//                             // System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");
//                             }
//                             else {
//                                 System.out.println("Sorry, you cant reserve on "+ dayreservation +". Because it is for "+ keterangan +".");
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//         System.out.println("Reservation Successfully, you can reserve on "+ dayreservation +", "+ keterangan +".");            
//     }
// }

