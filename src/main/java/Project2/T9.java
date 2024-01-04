package Project2;
/*
Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.
 */
public class T9 {


    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("abracadabra"));
    }
    private static char findFirstNonRepeatedChar(final String input) {
        final var len = input.length();
        for (var index = 0; index < len; index++) {
            final var ch = input.charAt(index);
            final var firstIndex = input.indexOf(ch);
            final var lastIndex = input.lastIndexOf(ch);
            if (firstIndex == lastIndex) {

                return ch;
            }
        }

        return 0;
}
}
