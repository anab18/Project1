package Project1;
/*
Maximum and minimum number in the array?
 */
public class T8 {
    public static void main(String[] args) {
        int [] x={20,10,33,55,92,42,1,};
        int max=x[0];
        int min=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>max) {
                max = x[i];
            } else if (x[i]<min){
                    min=x[i];
                }
            }
        System.out.println(max);
        System.out.println(min);
    }
}
