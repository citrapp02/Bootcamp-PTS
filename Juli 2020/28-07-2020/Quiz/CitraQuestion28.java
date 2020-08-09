public class CitraQuestion28 {
    public static void main(String[] args){
        int angka1, angka2;

        System.out.print("Tampilan angka : ");
        for (angka1 = 1; angka1 <= 6; angka1++){
            for (angka2 = 1; angka2 <= angka1; angka2++){
                if (angka1%2 == 0) {
                    System.out.print(angka1);
                }
                else {
                    System.out.print(angka2);
                }
            }
        }
    }
}