class Prime{
    public static void main(String[] args) {
        int a=11;
        int div=2;
        boolean primeornot=true;

        while (div<a) {
            if (a%div==0) {
                primeornot=false;
                break;
                
            }
            div=div+1;
        }
        if (primeornot) {
            System.out.println("Prime ");
            
        }else{
            System.out.println("No Prime");
        }
    }
}