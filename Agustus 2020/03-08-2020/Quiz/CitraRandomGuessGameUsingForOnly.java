import java.util.Scanner;

public class CitraRandomGuessGameUsingForOnly {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int ronde, kesempatan, secret, guess, score = 0;

        System.out.println("===MARI MAIN TEBAK ANGKA!!!===\n");
        System.out.println("Tebak angka antara 1 - 10. Permainan tebak angka ini terdiri dari 10 ronde. ");
        System.out.println("Masing- masing ronde teridiri dari 3 kesempatan menjawab. Selamat bermain!\n\n");

        for (ronde = 1; ronde <= 10; ronde++){
            secret = 1 + (int)(10*Math.random());
            System.out.println("\n==Ronde "+ronde+" dari 10==");
            for (kesempatan = 1; kesempatan <= 3; kesempatan++){
                System.out.print("\n>>Kesempatan "+kesempatan+" dari 3.");
                System.out.print("\nSilahkan tebak angka 1-10.\nMasukan tebakan anda\t: ");
                guess = keyboard.nextInt();                
                if (guess != secret){
                    if (guess < secret){
                        System.out.println("Maaf tebakan anda terlalu rendah.");
                    }
                    else{
                        System.out.println("Maaf tebakan anda terlalu tinggi.");
                    }
                }
                else {
                    System.out.println("Anda berhasil menebak!");
                    score++;
                    break;
                }
            }
            System.out.println(" ______________________________");
            System.out.println("|Score anda adalah\t: "+score+"    |");
            System.out.println(" ______________________________");

        }
    }
}