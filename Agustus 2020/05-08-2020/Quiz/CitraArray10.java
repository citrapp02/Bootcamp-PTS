import java.util.Scanner;

public class CitraArray10 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        int i, j;
        boolean match = false;

        System.out.println("Cek apakah sebuah kata adalah Palindrome!");
        System.out.println("Masukkan kata:\t");
        input = keyboard.next();
        // String[] word = input[];

        for (i = 0; i <= input.length()-1; i++){
            for (j = input.length()-1; j >= 0; j--){
                if (input.charAt(j) != input.charAt(i)){
                    match = false;
                }
                else {match = true;}
            }
        }

        if (match == true){
        System.out.println("Palindrome");
        }
        else {
            System.out.println("Tidak Palindrome");
        }
    }
}