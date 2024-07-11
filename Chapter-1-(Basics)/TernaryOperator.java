
// variable =  condition?statement1:statement2;

public class TernaryOperator{
    public static void main(String[] args) {
        int num = 34;
        String type =  (num%2 == 0)? "even" : "odd" ;

        System.out.println(type);
    }
}