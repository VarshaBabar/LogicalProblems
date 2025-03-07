// 5 4 3 2 1 
// D C B A 
// 3 2 1 
// B A 
// 1 
public class Pattern2 {
    public static void pattern(int n){
        for(int i = n ; i > 0; i--){
            for(int j = i ; j > 0; j--){
                if( i%2 == 1){
                    System.out.print(j + " ");
                }else{
                    System.out.print((char)('A'+j-1)+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
