public class SwitchStatementJava {

    public static void main(String[] args) {
        
        int choice = 2;

        switch(choice){
            case 1 : {
                System.out.println("Burger");
                break;
            }
            case 3 : {
                System.out.println("Pizza");
                break;
            }
            default:{
                System.out.println("Out of stock");
                break;
            }
        }
    }
}