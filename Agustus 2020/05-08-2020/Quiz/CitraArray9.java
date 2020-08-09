import java.util.Scanner;

public class CitraArray9 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String words;
        int baris, kolom, input, i, indexWords = 0;
        boolean letter = false;

        System.out.println("Batas segitiga : ");
        input = keyboard.nextInt();
        System.out.println("Kalimat : ");
        keyboard.nextLine();
        words = keyboard.nextLine();

        for (baris = 0; baris <= input; baris++){
           for (kolom = baris; kolom <=input-1; kolom++) {
               System.out.print(" ");
           }
           for (kolom = 0; kolom <= baris; kolom++){
                if (indexWords < words.length()){
                System.out.print(words.charAt(indexWords)+" ");
                indexWords++;
                }
                else {
                    System.out.print(" "+" ");
                }
           }
           System.out.println();
       }
    }
}