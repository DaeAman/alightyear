public class sumOfDigits{
    public static void main (String args[]){
    int a = 999;
    System.out.println(sumDigits(a));
}

    private static int sumDigits(int a) {
        if (a<=0){
            return 0;
        }

        int digits = a/10;
        int remainder = a%10;

        return remainder + sumDigits(digits);
       
    }
}