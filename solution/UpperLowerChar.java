// count lowercase and uppercase
// input = "Hello world!"
// output = uppercase = 1, lowercase = 9

public class UpperLowerChar {
    public static void main(String[] args) {
        String s = "Hello world";
        int upper = 0 , lower = 0;
        for(int i = 0 ; i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)){
                lower++;
            }
        }
        System.out.println("UpperCase : "+upper + " LowerCase : " + lower);
    }
}
