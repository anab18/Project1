package Project1;
/*Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.

 */
public class T4 {
    public static void main(String[] args) {
int [][] num={
        {1,2,3,4,5,6,},
        {7,8,9,1,22,5}
      };
        int sumOdd=0,sumEven=0;
     for(int a=0;a<num.length;a++){
    for(int b=0;b<num[a].length;b++) {
        if (num[a][b] % 2 == 0) {
            sumEven = sumEven + num[a][b];
        } else if (num[a][b] % 2 != 0) {
            sumOdd = sumOdd + num[a][b];

        }
    }
    }
         System.out.println("sum of  even:  " +sumEven);
         System.out.println("sum of odd:  "+sumOdd);
}
    }

