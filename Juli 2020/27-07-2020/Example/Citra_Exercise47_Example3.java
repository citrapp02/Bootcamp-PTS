public class Citra_Exercise47_Example3 {
    public static void main( String[] args ) {
        int s=1;
        while (s<= 100){
            int g=1;
            while (g<= 100){
                int c=1;
                while (c<= 100){
                    if ( s+g+c == 100 && 10.00*s + 3.50*g + 0.50*c == 100.00 ) {
                        System.out.print( s + " sheep, " );
                        System.out.print( g + " goats, and " );
                        System.out.println( c + " chickens." );
                    }
                c++;
                }
                g++;
            }
            s++;
        }
    }
}