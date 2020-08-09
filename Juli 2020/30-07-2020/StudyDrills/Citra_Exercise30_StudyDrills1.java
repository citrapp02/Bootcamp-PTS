import java.util.Scanner;

public class Citra_Exercise30_StudyDrills1{
    public static void main(String[] args ){
        Scanner keyboard = new Scanner(System.in);
        int current = 1, total = 0;

        System.out.print("Type in a bunch of values and i'll add them up. ");
        System.out.println("I'll stop when you type a zero");

        while (current != 0) {
            System.out.print("Value: ");
            current = keyboard.nextInt();
            total += current;
            System.out.println("The total so far is: "+ total);
        } 

        System.out.println("The final so far is: "+ total);
    }
}