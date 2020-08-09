import java.util.Scanner;

public class CitraQuestion44 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int tahunAwalInput, tahunAkirInput, tahun;

        System.out.print("Masukkan Tahun Awal: ");
        tahunAwalInput  = keyboard.nextInt();
        System.out.print("Masukkan Tahun Akhir: ");
        tahunAkirInput = keyboard.nextInt();

        System.out.println("\nTahun kabisat antara tahun "+tahunAwalInput+" dan "+tahunAkirInput+" adalah : ");
        for (tahun = tahunAwalInput; tahun <= tahunAkirInput; tahun++){
            if ((tahun%4 == 0 || tahun%400 == 0 || tahun%100 == 0) && (tahun%10 == 0)){
                System.out.print(tahun+" ");
            }
        }
    }
}