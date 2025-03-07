// Use while loop and print following pattern: 
// n = 19 
// 1 2 3 4 5 * * * * * 11 12 13 14 15 * * * *  

public class Pattern {
    public static void star(int n ){
        int count = 1;
        int m = (n/5)+1;
        for(int i = 1 ;i <= m ; i++){
            for(int j = 1 ;j <= 5; j++){
                if(count > n){
                    break;
                }
                System.out.print((i%2 == 1) ? count + " " : "* ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 19;
        star(n);
    }
}