public class natural {
    public static int naturalSum(int a){
        
        int sum =  a + naturalSum(a-1);
        return sum;
            
    }

    public static void main(String[] args) {
        int ab = 5;

        System.out.println(naturalSum(ab));
    }
}
