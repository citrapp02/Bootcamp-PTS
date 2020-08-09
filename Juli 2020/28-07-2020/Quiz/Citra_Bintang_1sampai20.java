
public class Citra_Bintang_1sampai20 {
    public static void main(String[] args ) {
        
        int baris = 0, kolom, diagonal2;
        
        
        /*1
            * * * * * * * * * * *
            * * * * *   * * * * *
            * * * *       * * * *
            * * *           * * *
            * *               * *
            *                   *
        */
        System.out.println("No 1.");
        for (baris = 6; baris >= 1; baris--){
            for (kolom = 1; kolom <= 6; kolom++){
                if (baris < kolom){
                System.out.print("  ");
                }
                else{System.out.print("* ");}
            }
            for (kolom = 11; kolom >= 7; kolom--){
                if (kolom-baris <= 6){
                System.out.print("* ");
                }
                else{System.out.print("  ");}
            }
        System.out.println();
        }
        /*2
                       *
                     * * *
                   * * * * *
                 * * * * * * *
               * * * * * * * * * 
             * * * * * * * * * * * 
        */
        System.out.println("No 2.");
        for (baris = 6; baris >= 1; baris--){
            for (kolom = 1; kolom <= 6; kolom++){
                if (baris <= kolom){
                System.out.print("* ");
                }
                else{System.out.print("  ");}
            }
            for (kolom = 11; kolom >= 7; kolom--){
                if (kolom-baris < 6){
                System.out.print("  ");
                }
                else{System.out.print("* ");}
            }
        System.out.println();
        }

        /*3
                    *
                    * *
                    * * *
                        *
                      * *
                    * * *
        */
        System.out.println("\n 3. ");
        for (baris = 1; baris <= 3; baris++){
            for (kolom = 1; kolom <= baris; kolom++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (baris = 3; baris >= 1; baris--){
            for (kolom = 1; kolom <= 3; kolom++){
                if (kolom >= baris){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
       

        /*4
                    *                   *
                    * *               * *
                    * * *           * * * 
                    * * * *       * * * * 
                    * * * * *   * * * * *
                    * * * * * * * * * * *
        */
        System.out.println("\n 4. ");
        for (baris = 1; baris <= 6; baris++){
            for (kolom = 1; kolom <= 6; kolom++){
                if  (baris >= kolom){
                    System.out.print("* ");
                }
                    else {System.out.print("  ");}
            }
            for (kolom = 11; kolom >= 7; kolom--){
                if ( kolom-baris <= 6) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }                
            }
        System.out.println();
        }

        /*5    
             * * * * * * * * * * * 
                * * * * * * * * * 
                  * * * * * * *
                    * * * * *
                      * * *
                        *
        */
        System.out.println("\n 5. ");
        for (baris = 1; baris <= 6; baris++){
            for (kolom = 1; kolom <= 6; kolom++){
                if  (baris > kolom){
                    System.out.print("  ");
                }
                    else {System.out.print("* ");}
            }
            for (kolom = 11; kolom >= 7; kolom--){
                if ( kolom-baris < 6) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }                
            }
        System.out.println();
        }



        /*6
                        *
                      * *
                    * * *
                    *
                    * *
                    * * *
        */
        System.out.println("\n 6. ");
        for (baris = 3; baris >= 1; baris--){
            for (kolom = 1; kolom <= 3; kolom++){
                if (kolom >= baris){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (baris = 1; baris <= 3; baris++){
            for (kolom = 1; kolom <= baris; kolom++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*7
                    * * * * *
                      * * * *
                        * * * 
                          * *
                            *
                          * *
                        * * *
                      * * * *
                    * * * * *
        */
        System.out.println("\n7. ");
        for (baris = 1; baris <5; baris++){
            for (kolom = 1; kolom <= 5; kolom++){
                if (kolom >= baris){
                    System.out.print("* ");
                }
                else {System.out.print("  ");}
            }
            System.out.println();
        }
        for (baris =5 ; baris >= 1; baris--){
            for (kolom = 1; kolom <= 5; kolom++){
                if (kolom >= baris){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /*8
            0 * * * * * * * * * * 
            0 * * * * * * * * * * 
            0 * * * * * * * * * * 
            0 * * * * * * * * * * 
            0 * * * * * * * * * * 
            0 0 0 0 0 0 0 0 0 0 0
        */
        System.out.println("\n8.");
        for (baris = 1; baris <= 6; baris++){
            for (kolom = 1; kolom <= 11; kolom++){
                if( (kolom == 1 || baris == 6) ){
                   System.out.print("0 ");                   
                }
                else {System.out.print("* ");}
                
            }
            System.out.println();
        }

        /*9
            * * * * * * * * * * * 
            * * * * * * * * * * * 
            * * * * * * * * * * * 
            * * * * * * * * * * * 
            * * * * * * * * * * * 
            0 0 0 0 0 0 0 0 0 0 0
        */
        System.out.println("\n9.");
        for (baris = 1; baris <= 6; baris++){
            for (kolom = 1; kolom <= 11; kolom++){
                if( (kolom == 11 || baris == 6) ){
                   System.out.print("0 ");                   
                }
                else {System.out.print("* ");}
                
            }
            System.out.println();
        }

        /*10
                    * * * * * *
                    * * * * *
                    * * * *
                    * * *
                    * * 
                    *
                    * * 
                    * * * 
                    * * * * 
                    * * * * *
        */
        System.out.println("\n10.");
        for (baris = 5; baris >= 1; baris--){
            for(kolom = 1; kolom <= baris+1; kolom++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (baris = 1; baris <= 5; baris++){
            for (kolom = 1; kolom <= baris; kolom++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*11
            0 0 0 0 0 0 0 0 0 0 0 
            0 * * * * * * * * * * 
            0 * * * * * * * * * * 
            0 * * * * * * * * * * 
            0 * * * * * * * * * *
            0 * * * * * * * * * *

        */
        System.out.println("\n11.");
        for (baris = 1; baris <= 6; baris++){
            for (kolom = 1; kolom <= 11; kolom++){
                if( (kolom == 1 || baris == 1) ){
                   System.out.print("0 ");                   
                }
                else {System.out.print("* ");}
                
            }
            System.out.println();
        }

        /*12
            0 0 0 0 0 0 0 0 0 0 0
            * * * * * * * * * * * 
            * * * * * * * * * * * 
            * * * * * * * * * * * 
            * * * * * * * * * * * 
            * * * * * * * * * * *
        */
        System.out.println("\n12.");
        for (baris = 1; baris <= 6; baris++){
            for (kolom = 1; kolom <= 11; kolom++){
                if( (kolom == 11 || baris == 1) ){
                   System.out.print("0 ");                   
                }
                else {System.out.print("* ");}
                
            }
            System.out.println();
        }


        /*13
                    0 * * * * *
                    0 0 * * * *
                    0 0 0 * * *
                    0 0 0 0 * *
                    0 0 0 0 0 *
                    0 0 0 0 0 0
        */
        System.out.println("\n13");
        for (baris = 1; baris <=7; baris++){
            for ( kolom = 1; kolom <= 7; kolom++){
                if (kolom > baris){
                    System.out.print("* ");
                }
                else {System.out.print("0 ");}
            }
            System.out.println();
        }
        /*14
                    * 0 0 0 0 0 0 
                    * * 0 0 0 0 0
                    * * * 0 0 0 0
                    * * * * 0 0 0 
                    * * * * * 0 0
                    * * * * * * 0
                    * * * * * * 0
        */
        System.out.println("\n14. ");
        for (baris = 1; baris <=7; baris++){
            for ( kolom = 1; kolom <= 7; kolom++){
                if (kolom > baris){
                    System.out.print("0 ");
                }
                else {System.out.print("* ");}
            }
            System.out.println();
        }

        /*15
                    0 0 0 0 0 0 *
                    0 0 0 0 0 * *
                    0 0 0 0 * * *
                    0 0 0 * * * * 
                    0 0 * * * * *
                    0 * * * * * *
        */
        System.out.println("\n15");
        for (baris = 7; baris >= 1; baris--){
            for(kolom = 1; kolom <= 7; kolom++){
                if (kolom >=  baris){
                    System.out.print("* ");
                }
                else {System.out.print("0 ");}
            }
            System.out.println();
        }

        /*16
                    0 0 0 0 0 0 *
                    0 0 0 0 0 * *
                    0 0 0 0 * * * 
                    0 0 0 * * * * 
                    0 0 * * * * *
                    0 * * * * * *
        */
        System.out.println("\n16. ");
        for (baris = 7; baris >= 1; baris--){
            for(kolom = 1; kolom <= 7; kolom++){
                if (kolom >=  baris){
                    System.out.print("0 ");
                }
                else {System.out.print("* ");}
            }
            System.out.println();
        }

        /*17
            0 0 0 0 0 0 *
            0 0 0 0 0 * 0 
            0 0 0 0 * 0 0
            0 0 0 * 0 0 0
            0 0 * 0 0 0 0
            0 * 0 0 0 0 0
        */
        System.out.println("\n17.");
        for (baris = 7; baris >= 1; baris--){
            for (kolom = 1; kolom <= 7; kolom++){
                if( kolom == baris ){
                   System.out.print("* ");                   
                }
                else {System.out.print("0 ");}
                
            }
            System.out.println();
        }

        /*18
            * 0 0 0 0 0 0 
            0 * 0 0 0 0 0 
            0 0 * 0 0 0 0 
            0 0 0 * 0 0 0 
            0 0 0 0 * 0 0 
            0 0 0 0 0 * 0 
        */
        System.out.println("\n18.");
        for (baris = 1; baris <= 7; baris++){
            for (kolom = 1; kolom <= 7; kolom++){
                if( kolom == baris ){
                   System.out.print("* ");                   
                }
                else {System.out.print("0 ");}
                
            }
            System.out.println();
        }

        /*19
            0 0 0 0 0 0 0
            0 * * * * * 0
            0 * * * * * 0
            0 * * * * * 0
            0 * * * * * 0
            0 0 0 0 0 0 0
        */
        System.out.println("\n19.");
        for (baris = 1; baris <= 7; baris++){
            for (kolom = 1; kolom <= 7; kolom++){
                if( (kolom == 1 || baris == 1) || (kolom == 7 || baris == 7)){
                   System.out.print("0 ");                   
                }
                else {System.out.print("* ");}
                
            }
            System.out.println();
        }

        /*20
            0 0 0 0 0 0 0 
            * * * * * * * 
            - - - - - - - 
            0 0 0 0 0 0 0 
            * * * * * * * 
            - - - - - - - 
        */
        System.out.println("\n20.");
        for (baris = 1; baris <= 6; baris++){
            for (kolom = 1; kolom <= 7; kolom++){
                if( (baris == 1)||(baris == 4)){
                   System.out.print("0 ");                   
                }
                else if ((baris == 2)||(baris == 5)){
                    System.out.print("* ");                   
                }
                else {System.out.print("- ");}
                
            }
            System.out.println();
        }
        
    }
}