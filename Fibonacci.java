// Write a function that generates the first n numbers of the Fibonacci sequence. The 
// Fibonacci sequence is a series of numbers where each number is the sum of the two 
// preceding ones, usually starting with 0 and 1. For example, the first 10 numbers in the 
// Fibonacci sequence are: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55. 

public class Fibonacci {
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n-1) + fibo(n -2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));;
    }
}
