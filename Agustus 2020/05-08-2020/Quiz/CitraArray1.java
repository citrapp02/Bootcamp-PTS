import java.util.Scanner;

public class CitraArray1 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        int searchNumber, count = 0;
        boolean found = false;

        System.out.print("Masukkan angka yang anda cari :\t");
        searchNumber = keyboard.nextInt();

        for (int i = 0; i < numbers.length; i++){
            if (searchNumber == numbers[i]){
                count++;
                found = true;
            }
        }
        if (found == true){
            System.out.print("Angka "+searchNumber+" yang anda cari ditemukan di arrays number.");
            System.out.println("Ada "+count+"angka ada di indeks ke:");
            for (int i = 0; i < numbers.length; i++){
            if (searchNumber == numbers[i]){
                found = true;
                System.out.print(i+", ");
            }
        }
        }
        
    }
}