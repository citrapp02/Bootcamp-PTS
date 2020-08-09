import java.util.Scanner;

public class Citra_Exercise44_Example {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, m;
        String messege;

        System.out.println("Enter a messege and i'll display it five times.");
        System.out.print("Messege: ");
        messege = keyboard.nextLine();

        for (n = 1; n <= 5; n++) {
            System.out.println(n+". "+messege);
        }

        // System.out.println("\nNow I'll show it ten times and cont by 5s");
        // for (n=5; n <= 50; n +=5){
        //     System.out.println(n+". "+messege);
        // }
        System.out.println("\nFinally, three times counting backward.");
        for (m=5; m <= 50; m +=5){
            for (n=3; n > 0; n -=1){
                System.out.println(m+ " " + n+". "+messege);
            }
        }
    }
}