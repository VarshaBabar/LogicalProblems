// WAP to print Fibonacci series without recursion. 
public class Fibonacci2 {
    public static int fib(int n ){
        int n1 = 0;
        int n2 = 1;
        int res = 0;
        for(int i = 1 ; i < n ; i++){
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
}
