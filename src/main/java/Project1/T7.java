package Project1;
/*
Write a Java Program to print the first 10 numbers of Fibonacci series.

 */
public class T7 {
    public static void main(String[] args) {

        int n=10,num1=0,num2=1;
        int num3;
        for(int i=1;i<=n;i++){
            System.out.print(num1+ ",");
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}



