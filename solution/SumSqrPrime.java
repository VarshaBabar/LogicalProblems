// Sum of squares of first n prime numbers
// Input = 4, Answer = 87
// Explanation: 2*2+3*3+5*5+7*7 = 87
// time complexity = O(n log(n)) 

public class SumSqrPrime {
    public static boolean isPrime(int n ){
        if(n < 2){
            return false;
        }
        for(int i = 2 ; i*i <= n ;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static int findSqr(int n){
        int sum = 0 , count = 0 , num = 0;

        while(count < n){
            if(isPrime(num)){
                sum += num*num;
                count++;
            }
            num++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 4;
        
        System.out.println(findSqr(n));
        
    }
}
