package Project2;
/*
Write a program to swap 2 String without a temporary variable?
 */
public class T1 {
    public static void main(String[] args) {
        String a="Birthday";
        String b="Happy";
        System.out.println("Before: "+ a+" "+b+"!");
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After : " +a+" "+b+"!");


    }
}
