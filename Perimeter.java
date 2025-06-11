import java.util.*;
public class Perimeter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float length=sc.nextFloat();
		float breadth=sc.nextFloat();
		double perimeter=2*(length+breadth);
		System.out.print(perimeter);	
	}
}