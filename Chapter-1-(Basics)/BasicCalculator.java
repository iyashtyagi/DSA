import java.util.*;

public class BasicCalculator{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num 2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the operation (+, -, *, /, %)");
		char operation = sc.next().charAt(0);
		sc.close();

		switch(operation){
			case '+' :{
				System.out.println(num1 + " + " + num2 + " = "+ (num1+num2));
					break;
			}	
			case '-' : {
				System.out.println(num1 + " - " + num2 + " = "+ (num1-num2));
				break;
	 		}		
			case '*' :{
				System.out.println(num1 + " * " + num2 + " = "+ (num1*num2));
				break;
			}		
			case '/' :{
				System.out.println(num1 + " / " + num2 + " = "+ (num1/num2));
				break;
			}		
			case '%' :{
				System.out.println(num1 + " % " + num2 + " = "+ (num1%num2));
				break;
			}						
			
			default : {
				System.out.println("Invalid operation");
			}
		}
	}	
				
}
