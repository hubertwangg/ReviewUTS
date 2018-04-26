import java.util.*;
import java.lang.*;
class g {
	static boolean leapYear(int year){
		if ((year%100==0) && (year%400==0)){
			return true;
		}
		else if ((year%4==0) && (year%400==0)){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(leapYear(n));
	}
}