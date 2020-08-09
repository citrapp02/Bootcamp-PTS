public class CitraQuestion30 {
    public static void main(String[] args){
        int angka1, angka2;

        System.out.println("Tampilan angka : ");
        for (angka1 = 6; angka1 >= 1; angka1--){
            for(angka2 = 6; angka2 >= 1; angka2--){
                if (angka1 < angka2){
                    System.out.print("");
                }
                else {
                    if (angka1 == 5 || angka1 == 3 || angka1 == 1){
                    System.out.print(angka1);
                    }
                    else {
                        System.out.print(angka2);
                    }
                    }
            }
        }
    }
}



        // System.out.println("Tampilan angka : ");
        // for (angka1 = 6; angka1 >= 1; angka1--){
        //     for(angka2 = 6; angka2 >= 1; angka2--){
        //         if (angka1 <= angka2){
        //             System.out.print("  ");
        //         }
        //         else {System.out.print(angka1 + " " +angka2+",");}
        //     }
        //     System.out.println();
        // }