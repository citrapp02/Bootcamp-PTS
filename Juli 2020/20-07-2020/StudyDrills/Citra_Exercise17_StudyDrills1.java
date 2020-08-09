public class Citra_Exercise17_StudyDrills1 {
     public static void main(String[] args) {
        int age = 22;
        boolean onGuestList = false;
        double allure = 7.5;
        String gender = "F";
        
        if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
            System.out.println("You are allowed to enter the club.");
        }
        System.out.println("C-C-C-COMBO BREAKER because I’m weird."); // tidak dapat di compile karena
        //statement prinln membuat statemen baru dan else butuh permulaan if agar dapat berjalan
        else {
            System.out.println("You are ot allowed to enter the club.");
        }
    }
}