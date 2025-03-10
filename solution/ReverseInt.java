// WAP to reverse an integer without converting it to a string, without using any built-in methods.

public class ReverseInt {
    public static int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev*10 + num % 10;
            num =  num / 10;
        }
        return rev;
    }
    public static void main(String args[]){
        int num = 123456;
        System.out.println(reverse(num));;
    }
}
