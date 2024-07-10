import java.util.*;

public class InputInJava{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
     
        String input = sc.next(); // .next() will capture only one word
        System.out.println(input);
     
        // String fullName = sc.nextLine(); //.next() - to capture everything
        // System.out.println(fullName);
     
        // int num = sc.nextInt(); //.next() - to capture int type data
        // System.out.println(fullName);

        sc.close();
    }
}