public class Citra_Exercise6_StudyDrills1 {
    public static void main( String[] args ) {
        int x, y, age, height;
        double seconds, e, checking, weight;
        String firstName, lastName, title, institution, degree;

        x= 10;
        y= 400;
        age= 39;
        height= 178;

        seconds= 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        weight= 79.50;

        firstName = "Graham";
        lastName = "Mitchel";
        title = "Mr.";
        institution = "Padepokan Tujuh Sembilan";
        degree = "Magister";

        System.out.println("The varieble x contains "+x);
        System.out.println("The value "+ y  +" is stored in the variable y.");
        System.out.println("The experiment took " + seconds + " seconds.");
        System.out.println("A favorite irrational # is Euler's number: " + e);
        System.out.println("Hopefully you have more than $"+checking+"!");
        System.out.println("My name's "+title+" "+firstName+" "+lastName+" had "+degree+" degree");
        System.out.println("I am " + age + "y.o, height = " + height+" cm and wieght"+ weight+" kg. Currently working at "+institution );
    }
}