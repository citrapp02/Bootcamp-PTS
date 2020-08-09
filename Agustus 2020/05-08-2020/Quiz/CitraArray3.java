import java.util.Scanner;

public class CitraArray3 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        int searchNumber, count = 0, changeNumber, i;
        boolean duplicate = false;

        System.out.println("Merubah Nilai dari arrays numbers!!!");
        System.out.println("Nilai dari numbers adalah: ");
        for (int number : numbers){
            System.out.print(number +", ");
        }
        System.out.println("\nMasukkan index yang mau diganti :\t");
        i = keyboard.nextInt();
        System.out.println("Masukkan nilai :\t");
        changeNumber = keyboard.nextInt();
        numbers[i] = changeNumber;
        for (int number : numbers){
            System.out.print(number +", ");
        }

    }
}