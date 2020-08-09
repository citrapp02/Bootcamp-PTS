public class CitraQuestion41 {
  public static void main(String[] args){
    int i, j=0;

    System.out.println("Tampilan angka : ");
    for (i = j; i <= 500; i++){
        for (j = i; j <= i; j++){
             System.out.print(j+" ");
             j *=2; 
             i = j;
             
        }
    }
  }
}
