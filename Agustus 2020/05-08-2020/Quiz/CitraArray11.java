import java.util.Scanner;

public class CitraArray11 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int searchNumber, count = 0, changeNumber, insertIndex, i, shift;
        boolean duplicate = false;

        System.out.println("Shift kiri sebanyak n kali");
        System.out.println("Hasil yang diinginkan :");
        for (int number : numbers){
            System.out.print(number +", ");
        }
        System.out.println("\nShift ke kiri Sebanyak :\t");
        shift = keyboard.nextInt();

        for (i = 0; i < numbers.length; i++){
            int[] temp = numbers;
            numbers = new int [10];
            
            for (i = 0; i < numbers.length; i++ ){
                if (i < 10-shift){
                    numbers[i] = temp[i+shift];
                    System.out.print(numbers[i]+", ");
                }
                else {
                    numbers[i] = temp[i-10+shift];
                    System.out.print(numbers[i]+", ");
                }
            }
        }
    }
}