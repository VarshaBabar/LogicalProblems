// Print list of odd/even numbers from 1-n, where n is input. 
// E.g.  
// n = 10 
// even_nums = [2, 4, 6, 8, 10] 
// odd_nums = [1, 3, 5, 7, 9] 

import java.util.Arrays;

public class Arr {
    public static void evenOdd(int s ,int n , int even[] , int odd[] , int iEven , int iOdd){
        if(s > n){
            return;
        }
        if(s%2 == 0){
            even[iEven++] = s;
        }else{
            odd[iOdd++] = s;
        }
        evenOdd(s+1 ,n, even, odd, iEven, iOdd);
    }
    public static void main(String[] args) {
        int n = 10;
        int even[] = new int[n/2];
        int odd[] = new int[(n+1)/2];
        evenOdd(1 ,n , even , odd , 0 ,0);
        System.out.println("Even : " + Arrays.toString(even));
        System.out.println("Odd : "  + Arrays.toString(odd));
    }
}