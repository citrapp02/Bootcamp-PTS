import java.util.Scanner;

public class CitraExerciseBangunDatar {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String paham, rumus, bidang;
        // int ;
        double alas, tinggi, sisi1, sisi2, luassegitiga, kelilingsegitiga, sisipersegi, luaspersegi, kelilingpersegi, panjangpersegipanjang, lebarpersegipanjang, luaspersegipanjang, kelilingpersegipanjang, luaslingkaran, kelilinglingkaran, jari, phi = 3.14;
        
        System.out.println( "\t|---\t\t\t\t---BIDANG DATAR---\t\t\t\t--|" );
        System.out.println( "\t|                                                                                 |" );
        System.out.println( "\t|!Disclaimer materi ini diperuntukkan bagi yang belum tahu/paham tentang bangun   |" );
        System.out.println( "\t|datar serta cara menghitungnya. Silahkan ketik \"next\" untuk melanjutkan belajar  |" );
        System.out.println( "\t|atau ketik \"done\" jika sudah paham mengenai bidang datar.!                       |" );
        System.out.println( "\t|                                                                                 |" );
        
        System.out.print( "\t Ketik disini (next/done)\t:\t" );
        paham = keyboard.next();
        System.out.println( "\t                                                                                   " );
        if (paham.equals("next")) {
            System.out.println( "\t Oke jadi bangun datar adalah..\n\t Sebuah bangun rata yang memiliki dua dimensi yaitu panjang dan lebar tetapi tidak \n\t memiliki tinggi dan tebal.\n" );
            System.out.print("\t Ketik next untuk mengetahui rumus-rumus bidang data\t\t");
            rumus = keyboard.next();
            if (rumus.equals("next")){
                System.out.println("\n\t Silahkan Pilih Bidang yang Ingin Anda Ketahui Rumusnya\n\t 1. Persegi\t\t3. Lingkaran\n\t 2. Persegi Panjang\t4. Segitiga");
                System.out.print("\n\t Masukkan Angka\t:\t");
                bidang = keyboard.next();
                if (bidang.equals("1")) {
                    System.out.println("\n\t 1. PERSEGI\n\t _______\n\t|       |\n\t|       |sisi (s)\n\t|_______|\n\tsisi (s)");
                    System.out.println("\n\t Rumus\n\t Luas\t\t:\t s x s\n\t Keliling\t:\t 4 x s");
                    System.out.print("\n\t Coba Hitung\n\t Masukkan sisi (s) persegi\t:\t");
                    sisipersegi = keyboard.nextDouble();
                    luaspersegi = sisipersegi * sisipersegi;
                    kelilingpersegi = (4*sisipersegi);
                    System.out.println("\t Maka didapatkan\n\t Luas\t\t= "+sisipersegi+" X "+sisipersegi+" = "+luaspersegi);
                    System.out.println("\t Keliling\t= 2 x ( "+sisipersegi+" ) = "+kelilingpersegi);
                }
                else if (bidang.equals("2")) {
                    System.out.println("\n\t 2. PERSEGI PANJANG\n\t _________\n\t|       |\n\t|       |lebar (l)\n\t|_________|\n\tpanjang (p)");
                    System.out.println("\n\t Rumus\n\t Luas\t\t:\t p x l\n\t Keliling\t:\t2p x 2l");
                    System.out.print("\n\t Coba Hitung\n\t Masukkan panjang (p) persegi panjang\t:\t");
                    panjangpersegipanjang = keyboard.nextDouble();
                    System.out.print("\t Masukkan lebar (l) persegi panjang\t:\t");
                    lebarpersegipanjang = keyboard.nextDouble();
                    luaspersegipanjang = panjangpersegipanjang * lebarpersegipanjang;
                    kelilingpersegipanjang = (2*panjangpersegipanjang)+(2*lebarpersegipanjang);
                    System.out.println("\t Maka didapatkan\n\t Luas\t\t= "+panjangpersegipanjang+" X "+lebarpersegipanjang+" = "+luaspersegipanjang);
                    System.out.println("\t Keliling\t= 2 x ( "+panjangpersegipanjang+"+"+lebarpersegipanjang+" ) = "+kelilingpersegipanjang);
                }
                else if (bidang.equals("3")) {
                    System.out.println("\n\t 3. LINGKARAN");
                    System.out.println("\n\t Rumus\n\t Luas\t\t:\t phi x r x r\n\t Keliling\t:\t 2 x phi x r");
                    System.out.print("\n\t Coba Hitung\n\t Masukkan jari-jari (r) lingkaran\t:\t");
                    jari = keyboard.nextDouble();
                    luaslingkaran = phi * jari * jari;
                    kelilinglingkaran = 2 * phi * jari;
                    System.out.println("\t Maka didapatkan\n\t Luas\t\t= "+phi+" X "+jari+" X "+jari+" = "+luaslingkaran);
                    System.out.println("\t Keliling\t= 2 x ( "+phi+" X "+jari+" ) = "+kelilinglingkaran);
                }
                else if (bidang.equals("4")){
                    System.out.println("\n\t 4. Segitiga\n\t\t\t\t/\\\n\t\t\t sisi 1/  \\sisi 2\n\t\t\t      /____\\\n\t\t\t\talas");
                    System.out.println("\n\t Rumus\n\t Luas\t\t:\t (alas x t) : 2\n\t Keliling\t:\t alas + sisi 1 + sisi 2");
                    System.out.print("\n\t Coba Hitung\n\t Masukkan alas (a) segitiga\t:\t");
                    alas = keyboard.nextDouble();
                    System.out.print("\n\t Masukkan tinggi (t) segitiga\t:\t");
                    tinggi = keyboard.nextDouble();
                    System.out.print("\n\t Masukkan sisi 1 (s1) segitiga\t:\t");
                    sisi1 = keyboard.nextDouble();
                    System.out.print("\n\t Masukkan sisi 2 (s2) segitiga\t:\t");
                    sisi2 = keyboard.nextDouble();
                    luassegitiga = (alas*tinggi)/2;
                    kelilingsegitiga = (alas+sisi1+sisi2);
                    System.out.println("\t Maka didapatkan\n\t Luas\t\t= ( "+alas+" X "+tinggi+" ) : 2 = "+luassegitiga);
                    System.out.println("\t Keliling\t= "+alas+" + "+sisi1+" + "+alas+" = "+kelilingsegitiga);
                }
                else {
                    System.out.println("Maaf bidang yang anda pilih belum kami buat");
                }
            }
            else {

            }
        }

        else if (paham.equals("done")) {
            System.out.print("\t Luar biasa!!! Anda sudah tahu apa yang dimaksud dengan bidang datar, itu merupa- \n\t kan hal baik. Kami harap ilmu anda selalu bertambah");
        }

        else {
            System.out.print( "\t\t\t!!!Mohon maaf kata yang anda ketikkan salah!!!\n\t\tSilahkan ketikkan kembali (next/done)\t:\t" );
            paham = keyboard.next();
            if (paham.equals("next")) {
            System.out.print( "\t Oke jadi bangun datar adalah..\n\t Sebuah bangun rata yang memiliki dua dimensi yaitu panjang dan lebar tetapi tidak \n\t memiliki tinggi dan tebal." );
            }
            else if (paham.equals("done")) {
                System.out.print("\t Luar biasa!!! Anda sudah tahu apa yang dimaksud dengan bidang datar, itu merupa- \n\t kan hal baik. Kami harap ilmu anda selalu bertambah");
            }
        }
    }
}