package Project2;
/*
Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome
 */
public class T4 {
    public static void main(String[] args) {
        String s="madam";
        String backward="";
        for (int i = s.length()-1;i>=0;i--){
            backward=backward+s.charAt(i);}

        if(s.equalsIgnoreCase(backward)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("It's not a palindrome");
        }
    }
}
