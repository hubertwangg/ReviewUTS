import java.util.*;
import java.lang.*;
class b {
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner (System.in);
		int a=input.nextInt(), b=input.nextInt(), c=input.nextInt();
		float s=(a+b+c)/2;
		System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}