package Project2;

import java.util.Arrays;

/*
5. Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams
 */
public class T5 {
    static boolean areAnagram(char[] s1, char[] s2) {
        int n1 = s1.length;
        int n2 = s2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < n1; i++)
            if (s1[i] != s2[i])
                return false;

        return true;
    }
    public static void main(String args[])
    {
        char str1[] = { 'w', 'r', 'i', 't' ,'e'};
        char str2[] = { 'r', 'w', 't', 'e','i' };

        if (areAnagram(str1, str2))
            System.out.println("The two strings are" + " anagram of each other");
        else
            System.out.println("The two strings are not" + " anagram of each other");
    }
}
