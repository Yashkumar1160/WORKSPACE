import java.util.*;
public class Volume{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		float h=sc.nextFloat();
		double vol=3.14*r*r*h;
		System.out.print(vol);	
	}
}