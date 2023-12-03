package Project1;
/* Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array.
*/
public class T2 {
    public static void main(String[] args) {
        int[] values = {2, 4, 6, 8, 11, 20, 56, 55};

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                sum = sum + values[i];
            }
        }
        System.out.println(sum);

    }
}

