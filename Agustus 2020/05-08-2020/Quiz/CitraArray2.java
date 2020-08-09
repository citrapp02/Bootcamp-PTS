public class CitraArray2 {
    public static void main(String[] args ) {
        int[] numbers = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        int searchNumber, count = 0;
        boolean duplicate = false;

        System.out.println("Dupikasi angka yang ada di dalam arrays numbers!!!");
        System.out.println("Angka duplikasi yang ada di arrays number adalah: ");

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < i; j++){
                if ((i != j) && (numbers[j] == numbers[i])){
                count++;
                    if (count >= 1 && i != j){
                    duplicate = true;
                    System.out.print(numbers[i]+" ");
                    }
                }
            }
        }       
    }
}