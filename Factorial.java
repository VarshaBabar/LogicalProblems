// Print Factorial of n 
// E.g n=4, output=24 (1*2*3*4=24) 
public class Factorial {
    public static int fact(int n ){
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));;
    }
}
