public class Citra_Exercise6_StudyDrills1 {
    public static void main(String[] args ){
        int a, b, c, d, e, f, g, h, i;
        double v, w, x, y, z;
        String one, two, both;

        a = 10;
        b = 27;
        System.out.println( "a is " + a + ", b is " + b );
        
        c = a+b;
        System.out.println("a+b " +c);

        d= a-b;
        System.out.println( "a-b is " + d );

        e = a+b*3;
        System.out.println( "a+b*3 is " + e );

        f = b / 2;
        System.out.println( "b/2 is " + f );

        g = b % 10;
        System.out.println( "b%10 is " + g );

        h = ((a/b) * 8)/3;
        System.out.println( "((a/b) * 8)/3 is "+h );

        i = ((b-a)/3) * 8;
        System.out.println( "((b-a)/3) * 8 is "+h );
        
        x = 1.1;
        System.out.println( "\nx is " + x );

        y = x*x;
        System.out.println( "x*x is " + y );

        z = b / 2;
        System.out.println( "b/2 is " + z );
        System.out.println();

        v = x*x/b;
        System.out.println( "x*x/b is " + y );

        w = x*x/a;
        System.out.println( "x*x/a is " + y );

        one = "dog";
        two = "house";
        both = one + two;
        System.out.println( both );
    }
}