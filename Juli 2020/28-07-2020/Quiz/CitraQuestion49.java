import java.util.Scanner;

public class CitraQuestion49 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int angkaAwalInput, angkaAkhirInput, angkaAwal;

        System.out.print("Masukkan Angka Awal: ");
        angkaAwalInput = keyboard.nextInt();
        System.out.print("Masukkan Angka Akhir: ");
        angkaAkhirInput = keyboard.nextInt();

        System.out.println("\nMaka angka yang dapat dibagi oleh 3 adalah : ");
        for (angkaAwal = angkaAwalInput; angkaAwal <= angkaAkhirInput; angkaAwal++){
            if (angkaAwal%3 == 0){
                System.out.print(angkaAwal +", ");
            }
        }
    }
}