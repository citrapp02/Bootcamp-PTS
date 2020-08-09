public class CitraArray8 {
    public static void main(String[] args ) {
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        int i, j;
        boolean besar = false;

        System.out.println("Nilai Terbesar dan Terkecil dari arrays numbers!!!");
        System.out.println("Nilai dari numbers adalah: ");
        for (int number : numbers){
            System.out.print(number +", ");
        }


        for (i = 0; i < numbers.length; i++){
            for (j = 0; j < numbers.length; j++){
            if ( (j != i) && numbers[j] < numbers[i]){
                int temp = numbers[i];
                numbers[i] =  numbers[j];
                numbers[j] = temp;
                besar = true;
            }
            }
        }
        
        System.out.println();
        

            for (j = 0; j < numbers.length; j++){
            if (besar == true){
                System.out.print(numbers[j]+" " );
            }
            }
    }
}