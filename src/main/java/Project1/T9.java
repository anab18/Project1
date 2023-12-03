package Project1;
/*
Write a java program to find the second largest number in the array?

 */
public class T9 {
    public static void main(String[] args) {
        int[] x = {22, 55, 69, 93, 400, 32, 1};
         int large=0;
         int secondLargest=0;
         for( int i=0;i<x.length;i++){
             if(x[i]>large){
                 secondLargest=large;
                 large=x[i];
                 }else if (x[i]>secondLargest && x[i]!=large){
                 secondLargest=x[i];
             }
         }
        System.out.println("Second largest number "+secondLargest);
    }
}
