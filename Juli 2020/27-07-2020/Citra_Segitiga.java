import java.util.Scanner;

public class Citra_Segitiga {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int input = keyboard.nextInt();
        
        /*segitiga siku2
                    *
                    * *
                    * * *
                    * * * *
        */
        System.out.println("\nSegitiga ke-1");
        for (int baris = 1; baris <= input; baris++){
            for (int kolom = 1; kolom <= baris; kolom++){
                System.out.print("* ");
            }
            System.out.println();
        }


        /*segitiga siku2 terbalik
                    * * * *
                    * * *
                    * * 
                    *
        */
        System.out.println("\nSegitiga ke-2");
        for (int baris = input; baris >= 1; baris--){
            for(int kolom = 1; kolom <= baris; kolom++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

        /*Segitiga siku2
                    * * * * *
                      * * * *
                        * * * 
                          * *
                            *
        */
        System.out.println("\nSegitiga ke-3");
        for (int baris = 1; baris <=input; baris++){
            for (int kolom = 1; kolom <= input; kolom++){
                if (kolom >= baris){
                    System.out.print("* ");
                }
                else {System.out.print("  ");}
            }
            System.out.println();
        }

        /*segitiga siku2
                          *
                        * *
                      * * *
                    * * * *
                  * * * * *
        */
        System.out.println("\nSegitiga ke-4");
        for (int baris = input; baris >= 1; baris--){
            for (int kolom = 1; kolom <= input; kolom++){
                if (kolom >= baris){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        
    }
}