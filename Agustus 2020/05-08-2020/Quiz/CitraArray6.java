public class CitraArray6 {
    public static void main(String[] args ) {
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        int i, j, besar, kecil;

        System.out.println("Nilai Terbesar dan Terkecil dari arrays numbers!!!");
        System.out.println("Nilai dari numbers adalah: ");
        for (int number : numbers){
            System.out.print(number +", ");
        }
        besar = numbers[0];
        kecil = numbers[0];
        for (i = 0; i < numbers.length; i++){
            if (besar < numbers[i]){
                besar = numbers[i];
            }
            if (kecil > numbers[i]){
                kecil = numbers[i];
            }
        }
        System.out.println("\nNilai terbesar adalah "+besar );
        System.out.println("Nilai terkecil adalah "+kecil );
    }
}