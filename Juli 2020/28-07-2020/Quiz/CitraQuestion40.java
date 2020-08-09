public class CitraQuestion40 {
    public static void main(String[] args){
        int i, j;

        System.out.println("Tampilan angka : "); 
        for (i = 1; i <= 25; i++){
            for (j = i; j <= 1; j++ ){
                j += 1;
                System.out.print(j+" "+i);
            }
        } 
    }
}