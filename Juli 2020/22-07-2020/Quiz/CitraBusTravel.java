import java.util.Scanner;

public class CitraBusTravel {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int passengers;
        
        System.out.print("============= Screened Results ===========\n\nWelcome to Secret Travel\n\nEnter Number of Passengers:\n");
        passengers = keyboard.nextInt();

        System.out.println("\nBuses Available For You:");
        if ( passengers > 6 || passengers <= 6 ){
            System.out.println("Bus Executive with 6 Chairs Rp. 2,000,000");
            
        }
        if ( passengers >= 12 ){
            System.out.println("Bus With Chair 12 Rp. 1,300,000");
            
        }
        if ( passengers >= 18 ){
            System.out.println("Bus With Seat 18 Rp. 1,500,000");
            
        }
        if ( passengers >= 32 ){
            System.out.println("Bus With Seat 32 Rp. 1,800,000");
        }
        if ( passengers > 45 ){
            System.out.println("Bus With Seat 45 Rp. 2,000,000");
        }
        if ( passengers > 60 ){
            System.out.println("Bus With Seat 60 Rp. 2,300,000");
        }
        

        System.out.println("\n* Recommended bus for you");
        if (passengers <=6) {
            System.out.println("1 bus with 6 seats with a price of Rp. 2,000,000");
        } 
        else {
            if (passengers >6 && passengers < 12) {
                System.out.println("2 bus with 6 seats with a price of Rp. 4,000,000");
            }
            else {
                if (passengers <= 12) {
                System.out.println("1 bus with 12 seats with a price of Rp. 1,300,000");
                }
                else {
                    if (passengers >12 && passengers < 18) {
                        System.out.println("2 bus with 12 seats with a price of Rp. 2,600,000");
                    }
                    else {
                        if (passengers <= 18) {
                            System.out.println("1 bus with 18 seats with a price of Rp. 1,500,000");
                        }
                        else {
                            if (passengers >18 && passengers <= 30) {
                                System.out.println("1 bus with 18 seats and 1 bus with 12 seats with a price of Rp. 2,800,000");
                            }
                            else {
                                if (passengers > 30 && passengers < 32) {
                                    System.out.println("2 bus with 18 seats with a price of Rp. 3,000,000");
                                }
                                else {
                                    if (passengers <= 32){
                                        System.out.println("1 bus with 32 seats with a price of Rp. 1,800,000");
                                    }
                                    else {
                                        if (passengers > 32 && passengers < 45) {
                                            System.out.println("1 bus with 32 seats and 1 bus with 12 seats with a price of Rp. 3,100,000");
                                        }
                                        else {
                                            if (passengers <= 45 && passengers <= 57) {
                                                System.out.println("1 bus with 45 seats and 1 bus with 12 seats with a price of Rp. 3,100,000");
                                            }
                                            else {
                                                if (passengers > 57 && passengers <= 60 ) {
                                                    System.out.println("1 bus with 45 seats and 1 bus with 18 seats with a price of Rp. 3,500,000");
                                                }
                                                else {
                                                    if (passengers > 60 &&  passengers <= 72) {
                                                        System.out.println("1 bus with 60 seats and 1 bus with 12 seats with a price of Rp. 3,600,000");
                                                    }
                                                    else {
                                                        if (passengers > 72 &&  passengers <= 77) {
                                                            System.out.println("1 bus with 60 seats and 1 bus with 18 seats with a price of Rp. 3,800,000");
                                                        }
                                                        else {
                                                            if (passengers > 77 &&  passengers <= 90) {
                                                                System.out.println("2 bus with 45 seats with a price of Rp. 4,000,000");
                                                            }
                                                            else {
                                                                if (passengers > 90 &&  passengers <= 95) {
                                                                    System.out.println("1 bus with 60 seats and 1 bus with 45 seats with a price of Rp. 4,300,000");
                                                                }
                                                                else {
                                                                    if (passengers > 95 &&  passengers <= 120) {
                                                                        System.out.println("2 bus with 60 seats with a price of Rp. 4,600,000");
                                                                    }
                                                                    else {
                                                                        System.out.println("Sorry, the ammount of the passenger exceed maximum.");
                                                                    }
                                                                }
                                                            }
                                                        }   
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }        
            }
        }       
    }
}