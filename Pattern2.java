/**
 * Pattern2
 */
public class Pattern2 {

    public static void main(String[] args) {
        int i,j;
        int n=5;
        //outer loop
     for(i=1; i<=n; i++){
        //spaces
        for(j=1;j<=n-i; j++){
            System.out.print(" ");
        }
        //numbers
        // decending order sequence
        for(j=i; j>=1; j--){
            System.out.print(j);
        }
        //ascending order sequence
        for(j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
     }


    }
}