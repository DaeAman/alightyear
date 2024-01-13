public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibSeq (10));
    }

    public static int fibSeq(int a){
        
        if(a==0 ){
            return 0;
        }
        else if(a==1){
            return 1;
        }
       return (fibSeq(a-1) + fibSeq(a-2));
    }

    
}
