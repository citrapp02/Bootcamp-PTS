public class CitraQuestion42 {
  public static void main(String[] args){
    int angka1, angka2, kali=1;

    System.out.println("3! adalah : ");
    for (angka1 = 3; angka1 >= 1; angka1--){
        for(angka2 = 3; angka2 >= 1; angka2--){
            if (angka1 == 3){
                System.out.print(angka2+" x ");
                kali *= angka2;
            }
        }
    }
    System.out.print("\b\b\b = " + kali);
  }
}
