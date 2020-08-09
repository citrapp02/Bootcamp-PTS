import java.util.Scanner;

public class CitraMoneyCaseQuiz {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double cash, shirt, shoes, backpack, eat, extra, tuition, money;

        System.out.print( "How much your cash? \t\t\t"  );
        cash = keyboard.nextInt();
        System.out.print( "How much you spend for shirt? \t\t"  );
        shirt = keyboard.nextInt();
        System.out.print( "How much you spend for shoes? \t\t"  );
        shoes = keyboard.nextInt();
        System.out.print( "How much you spend for backpack? \t"  );
        backpack = keyboard.nextInt();
        System.out.print( "How much you spend to eat? \t\t"  );
        eat = keyboard.nextInt();
        System.out.print( "How much you get extra money? \t\t"  );
        extra = keyboard.nextInt();
        System.out.print( "How much did you paid for tuition? \t"  );
        tuition = keyboard.nextInt();
        
        money = cash-(shirt+shoes+backpack+eat)+extra-tuition;
        System.out.println( "Your money now is \t\t\t$ " + money );

        System.out.println( "You has $ "+cash+" in cash. Then you bought a $ "+shirt+" shirt, $ "+shoes+" shoes, and a $ "+backpack+" backpack. you spent $ "+eat +" to eat at a restaurant with your friend. When you returned home, you got extra money from your uncle with $ "+extra+". the next day you paid a tuition of $ "+tuition+". Now your money is $ "+money );
    }
}