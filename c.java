import java.util.*;
import java.lang.*;
class c {
	static int x=1,y=1;
	static void swap(){
		x+=y;
		y=x-y;
		x-=y;
	}
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.format("1\n1\n");
		for (int i=2;i<n;i++){
			y+=x;
			System.out.format("%d\n",y);
			swap();
		}
	}
}