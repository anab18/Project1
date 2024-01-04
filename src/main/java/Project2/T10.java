package Project2;

import java.util.ArrayList;
import java.util.Arrays;

/*
How can you remove all duplicates from ArrayList?
 */
public class T10 {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,2,4,4,5,3,4,6));
        System.out.println("ArrayList with duplicates:"+ list);
        ArrayList<Integer>newList=removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed:" +newList);

    }
}