public class CitraQuestion39 {
    public static void main(String[] args){
        int angka;

        System.out.println("Tampilan angka : ");
        for (angka = 3; angka <= 130; angka -= 5){
            System.out.print(angka);
            angka *= 3;
            System.out.print(" " + angka+" ");
        }

    }
}