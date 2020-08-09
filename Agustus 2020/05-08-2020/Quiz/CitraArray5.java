import java.util.Scanner;

public class CitraArray5 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        int searchNumber, count = 0, changeNumber, firstIndex, secondIndex, i;
        boolean duplicate = false;

        System.out.println("Switch Nilai dari arrays numbers!!!");
        System.out.println("Nilai dari numbers adalah: ");
        for (int number : numbers){
            System.out.print(number +", ");
        }
        System.out.println("\nMasukan index Pertama :\t");
        firstIndex = keyboard.nextInt();
        int num1 = numbers[firstIndex];
        // System.out.println(num1);

        System.out.println("\nMasukan index Kedua :\t");
        secondIndex = keyboard.nextInt();
        int num2 = numbers[secondIndex];
        // System.out.println(num2);

        for (i = 0; i < numbers.length; i++){
            if (i == firstIndex){
                numbers[i] = num2;
            System.out.print(numbers[i]+", ");
            }
            else if (i == secondIndex){
                numbers[i] = num1;
                System.out.print(numbers[i]+", ");
            }
            else {
                System.out.print(numbers[i]+", ");
            }
        }
    }
}