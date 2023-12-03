package Project1;
/*
Write a program to print out duplicate elements from an Array of Strings?
 */
public class T10 {
    public static void main(String[] args) {
       String [] x= {"Maria","Ana","Vera","Ana","Alina","Tudor"};

       for( int i=0;i<x.length;i++){
           for(int y=i+1; y<x.length; y++){
               if (x[i]==x[y]){
                   System.out.println(x[y]);
               }
           }
       }
    }
}
