package Project1;
/*Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.

 */
public class T1 {
    public static void main(String[] args) {
        int[] tem = {30,10,5,1, -2, -3,-5};
            int max=tem[0];
            int min=tem[6];
        for (int i = 0; i < tem.length; i++) {
            if(tem[i]>0) {
            }else if(tem[i]<0) {

            }
        }
        System.out.println("Highest temperature for the week "+max);
        System.out.println("Lowest temperature for the week "+min);

            }
        }

