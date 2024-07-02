import java.util.*;

public class Scanner_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your First Name");
        String Fname = sc.nextLine();

        System.out.println("Enter Your Last Name");
        String Lname = sc.nextLine();

        System.out.println(" Enter 2 Values for Addition , Multiplication");
        System.out.println("Enter Value of A");
        int a=sc.nextInt();

        System.err.println("Enter Value of B");
        int b=sc.nextInt();

        int c= a+b;
        int d=a*b;

        System.err.println("your name is  "+ Fname + " "+ Lname + " right");
        System.out.println("Addition of " +a + " + " + b +" = " + c );
        System.out.println("Multiplication of " +a + " x " + b +" = " + d );
        
        System.out.println("-----------------------------------");

        System.out.println("Enter Radius of circle to find Area");
        float area=sc.nextFloat();

        float area1 = (3.14f)*(area*area);
        System.out.println(area1);

    }
}
