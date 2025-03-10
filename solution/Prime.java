// Find prime numbers from 1 ....n  

public class Prime {
    public static boolean primeNum(int n){
        if(n < 2 ){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 23;
        for(int i = 2 ; i <= n ;i++){
            if(primeNum(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
