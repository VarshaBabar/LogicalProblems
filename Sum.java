// Print sum of first n numbers 
// E.g. n=5, output=15 (1+2+3+4+5=15) 
public class Sum{
    public static int sumN(int n ){
        if(n == 0){
            return 0;
        }
        return n +sumN(n-1);
    }
    public static void main(String[] args) {
        int n = 5 ; 
        System.out.println(sumN(n));
    }
}