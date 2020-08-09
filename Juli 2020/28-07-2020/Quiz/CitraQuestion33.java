public class CitraQuestion33 {
    public static void main(String[] args){
        int angka1, angka2;

        System.out.print("Tampilan angka : ");
        for (angka1 = 1; angka1 <= 9; angka1++){
            for (angka2 = 1; angka2 <= angka1; angka2++){
                if (angka1 == 3 || angka1 == 4 || angka1 == 7 || angka1 == 8 ) {
                    System.out.print(angka1);
                }
                else {
                    System.out.print(angka2);
                }
            }
        }
    }
}