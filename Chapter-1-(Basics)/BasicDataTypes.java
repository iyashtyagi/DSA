public class BasicDataTypes{
    public static void main( String args[]){

        byte b = 10; // 1-byte signed integer, can hold value from -128 to 127
        int num = 44556; // 4-byte signed integer, can hold value from  -2,147,483,648 to 2,147,483,647
        float price = 2.2f; // 4-byte, to store floating number, syntax -  either append 'f' 'F' in the end or use `(float) value`
        char c = 'h'; // 2-byte, it used to store single character init
        boolean var = true; // 1-byte, true or false
        long longNum = 64646466; // 8-byte, used to store long integer init
        short shortNum = 23; // 2-byte used to store short integer init
        double longFloat = 4556.23; // 8-byte  ,used to store long float init, don't have to explicitly write 'd' or 'D'
    
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