// WAP to print following pattern (use while loop): 
//  3 2 1 
//    2 1 
//      1 
public class RevNumPattern {
    public static void main(String[] args) {
        int n = 3 ;
        for(int i = n ; i > 0 ;i--){
            for(int j = 0; j < n-i ; j++){
                System.out.print("  ");
            }
            for(int j = i; j >0;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
