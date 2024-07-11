import java.util.*;

public class AreaOfCircle{
	public static void main( String args[]){
		Scanner sc =  new Scanner(System.in);
		float radius = sc.nextFloat();
		sc.close();

		double areaOfCircle = 3.14 * (radius * radius);

		System.out.println(areaOfCircle);
	}
}
