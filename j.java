import java.util.*;
import java.lang.*;
class j {
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		System.out.format("In:");
		float temp=input.nextFloat();
		if (temp<-273.15){
			System.out.println("Below 0 K");
		}
		else if (temp<0){
			System.out.println("Solid");
		}
		else if (temp>=100){
			System.out.println("Gas");
		}
		else{
			System.out.println("Liquid");
		}
	}
}