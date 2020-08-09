import java.util.Scanner;

public class CitraRainfallQuiz {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double april, may, june, ave;

        System.out.print( "Rainfall for April: \t"  );
        april = keyboard.nextInt();
        System.out.print( "Rainfall for May: \t"  );
        may = keyboard.nextInt();
        System.out.print( "Rainfall for June: \t"  );
        june = keyboard.nextInt();

        ave = (april+may+june)/3;
        System.out.println( "Average rainfall:\t" + ave );
    }
}