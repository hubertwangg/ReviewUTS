import java.util.*;
import java.lang.*;
class h {
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
		int n=0;
		for (int i=1600;i<=2020;i++){
			if (leapYear(i)){
				n++;
			}
		}
		System.out.println(n);
	}
}