import java.util.Scanner;

public class Citra_Exercise10_StudyDrills1 {
    public static void main( String[] args ) {


        Scanner keyboard = new Scanner(System.in);
        double price, salesTax, total;

        salesTax = price * 0.0825;
        total = price + salesTax;
        
        System.out.print( "How much is the purchase price? " );
        price = keyboard.nextDouble();
                
        System.out.println( "Item price:\t" + price );
        System.out.println( "Sales tax:\t" + salesTax );
        System.out.println( "Total cost:\t" + total );
    }
}
//error
// Citra_Exercise10_StudyDrills1.java:10: error: variable price might not have been initialized
//         salesTax = price * 0.0825;
//                    ^
// 1 error