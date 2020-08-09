public class Citra_Exercise17_Example {
     public static void main(String[] args) {
        int age = 22;
        boolean onGuestList = false;
        double allure = 7.5;
        String gender = "F";
        
        if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
            System.out.println("You are allowed to enter the club.");
        }
        else {
            System.out.println("You are ot allowed to enter the club.");
        }
    }
}