// Find the reverse of the string.
public class ReverseString {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1 ; i >= 0 ;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "varsha";
        System.out.println(reverse(s));
    }
}