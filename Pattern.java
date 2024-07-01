/**
 * Pattern number pyramid 
 */
public class Pattern {


    public static void main(String[] args) {
        int i,j;
        int n=5;
        // outer loop
        for(i=1; i<=5; i++){
            // spaces inner loop
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // numbers inner loop
            for(j=1; j<=i; j++){
                System.out.print(i + " ");
            }

            System.out.println(); 
        }   
    }
}