import java.util.*;
import java.lang.*;
class l {
	static int n;
	static Double S;
	static Double value (double left, double right){
		Double mid=(left+right)/2;
		if ((Math.pow(mid,n)==S) || (Math.abs(left-right)<0.00005)){
			return mid;
		}
		if (Math.pow(mid,n)-S<0){
			return value(mid,right);
		}
		else{
			return value(left,mid);
		}
	} 
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		S=input.nextDouble();
		n=input.nextInt();
		System.out.format("%.3f\n",value(0,S));
	}
}