// Check whether number is a prime number or not 
// E.g. n=6, output=false 
public class Prime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i*i <= n; i++) {
                if (n%i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPrime(n));
    }
}
