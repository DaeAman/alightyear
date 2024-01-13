public class sumOfDigits {
    
    public static void main(String[] args) {
        int a =123;
        System.out.println(sum(a));
    }

    private static int sum(int a) {
        int sum1 =0;
        if (a/10<0){
            return a;
        }
        else{
            sum1 = sum1 + sum(a%10);
            a = a/10 ;
            return sum1;
        }

        
    }
    
}
