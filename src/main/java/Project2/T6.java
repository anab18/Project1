package Project2;
/*
Create a method to count how many vowels are present in a string
“documentation”
 */
public class T6 {
    public static void main(String[] args) {
        String str = "documentation";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'o') {
                count += 1;
            }
        }
            System.out.println(count);
        }
    }


