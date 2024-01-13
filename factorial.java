public class factorial {

    int data = 5;

    public factorial (int a){
        this.data = a;
        a = a* (a-1);
        System.out.println(data);

    }

    public static void main(String[] args) {
        factorial a = new factorial(5);
        System.out.println(a);
    }
}
    