import java.util.Scanner;

public class CitraConvertTimeQuiz {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int jam, sisajam, menit, sisamenit, waktu;

        System.out.print( "Masukkan waktu untuk dikonversikan (detik)\t: \t"  );
        waktu = keyboard.nextInt();

        jam = (int)(waktu/3600);
        sisajam = waktu%3600;
        menit = (int)(sisajam/60);
        sisamenit = sisajam%60;
        System.out.print( "Jadi waktu "+waktu+" detik adalah\t\t\t:\t"+jam +" jam "+ menit +" menit " + sisamenit +" detik");
    }
}