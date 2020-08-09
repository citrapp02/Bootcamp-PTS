import java.util.Scanner;

public class Citra_Exercise29_StudyDrills1 {
    public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    String coin, again = "y";
    int streak = 0;
    boolean gotHeads;

    while (again.equals("y")){
        gotHeads = Math.random() < 0.5;

        if (gotHeads)
            coin = "HEADS";
        else
            coin = "TAILS";

        System.out.println("You flip a coin and it is ..."+ coin);

        if (gotHeads) {
            streak++;
            System.out.println("\tThat's " + streak+" 1n a row.....");

            System.out.print("\tWould you like to flip again (y/n)? ");
            again = keyboard.next();
        }
        else {
            System.out.println("\tYou lose everything1 ");
            System.out.println("\tShoul've quit while you were a HEAD.....");
            streak = 0;
            again = "n";
        }
    }
        System.out.println("Final score: "+streak);
    }
}