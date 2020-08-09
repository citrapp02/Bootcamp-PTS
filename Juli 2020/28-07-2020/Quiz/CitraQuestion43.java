public class CitraQuestion43 {
    public static void main(String[] args){
        int i, j = 0, k = 1, l = 1;
        
        System.out.println("Bilangan fibonacci : ");
        for (i = 0; i <= 34; i++){
            System.out.print(j+" ");
            k = l + j;      l = j;      j = k; 
        }
    }
}