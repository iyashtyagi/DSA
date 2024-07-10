public class BasicDataTypes{
    public static void main( String args[]){

        byte b = 10; // 8-bit signed integer, can hold value from -128 to 127
        int num = 44556; // 32-bit signed integer, can hold value from  -2,147,483,648 to 2,147,483,647
        float price = 2.2f; // to store floating number, syntax -  either append 'f' 'F' in the end or use `(float) value`
        char c = 'h'; // it used to store single character init
        boolean var = true; // true or false
        long longNum = 64646466; // used to store long integer init
        short shortNum = 23; // used to store short integer init
        double longFloat = 4556.23; // used to store long float init, don't have to explicitly write 'd' or 'D'
    
        System.out.println(b);
        System.out.println(num);
        System.out.println(price);
        System.out.println(c);
        System.out.println(var);
        System.out.println(longNum);
        System.out.println(shortNum);
        System.out.println(longFloat);

    }
}