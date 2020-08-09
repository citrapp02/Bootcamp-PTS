import java.util.Scanner;

public class CitraArray4 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        int searchNumber, count = 0, changeNumber, insertIndex, i;
        boolean duplicate = false;

        System.out.println("Menyisipkan Nilai di arrays numbers!!!");
        System.out.println("Nilai dari numbers adalah: ");
        for (int number : numbers){
            System.out.print(number +", ");
        }
        System.out.println("\nMasukan Nilai yang akan disisipkan :\t");
        changeNumber= keyboard.nextInt();
        System.out.println("Disisipkan pada index ke :\t");
        insertIndex = keyboard.nextInt();

        for (i= 0; i < numbers.length; i++){
            int[] temp = numbers;
            numbers = new int [14];
            for (i = 0; i < numbers.length; i++){
                if (i < insertIndex){
                    // numbers[0] = temp[0];
                    numbers[i] = temp[i];
                    System.out.print(numbers[i]+", ");
                }
                else if ( i == insertIndex){
                    numbers[i] = changeNumber;
                    System.out.print(numbers[i]+", ");
                }
                else {
                    numbers[i] = temp[i-1];
                    System.out.print(numbers[i]+", ");

                }
            }
        }
    }
}