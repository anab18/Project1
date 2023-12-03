package Project1;
/*Write a program to swap 2 numbers without a temporary variable?

 */
public class T5 {

    public static void main(String[] args) {
        int a=20;
        int b=25;
        System.out.println("Before swapping the numbers:");
        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);


        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println();
        System.out.println("After swapping the numbers:");
        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);
    }
}
