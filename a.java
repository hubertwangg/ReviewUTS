import java.util.*;
import java.lang.*;
class a{
	public static void main(String[] args) throws java.lang.Exception{
		Scanner input = new Scanner (System.in);
		System.out.format("In: ");
		int k=input.nextInt();
		if (k%6==0){
			System.out.println("OK");
		}
		else{
			System.out.println("TIDAK OK");
		}
	}
}