// Given a string of 0s and 1s print the value of string, where val(0)=1, val(1)=2 
// Input: 00010110 
// Output: 11 
public class Str {
    public static int output(String s){
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            sum += (ch == '0') ? 1 : 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "00010110";
        System.out.println(output(s));
    }    
}
