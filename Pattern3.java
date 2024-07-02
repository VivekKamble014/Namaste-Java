public class Pattern3 {
    public static void main(String[] args) {
        int i,j;
        int n=4;
// using only print ststment
     System.out.println("****");   
     System.out.println("***");
    System.out.println("**");
    System.out.println("*");
    System.out.println();
    System.out.println();
    
// using logic and loop
     for(i=0; i<=n; i++){
        for(j=1; j<=n-i; j++){

            System.out.print("*");
        }
        System.out.println();
     }
    
}}
 