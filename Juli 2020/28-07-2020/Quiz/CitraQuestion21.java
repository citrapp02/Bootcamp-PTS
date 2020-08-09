import java.util.Scanner;

public class CitraQuestion21 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String kata, kataKebalik = "";
        int panjang;
        System.out.print("Masukkan kata: ");
        kata = keyboard.nextLine();

        panjang = kata.length();
        for (int i = panjang-1 ; i >= 0 ; i--) {
            kataKebalik = kataKebalik + kata.charAt(i);
        }

        System.out.println("Kebalikannya adalah "+kataKebalik+"");
    }
}