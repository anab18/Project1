package Project2;

import java.util.ArrayList;
import java.util.Arrays;

/*
You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".
 */
public class T8 {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
              name.add("Andrei");
              name.add("Rayon");
              name.add("Aaron");
        for (int i = 0; i < name.size(); i++) {
            String s = name.get(i);
            if (s.startsWith("A")) {
                System.out.println(s.toLowerCase());
            }else{
                System.out.println(s.toUpperCase());
            }
        }
    }
}
