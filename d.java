import java.util.*;
import java.lang.*;
class d {
	public static void main (String[] args) throws java.lang.Exception{
		Random ran=new Random();
		Scanner input=new Scanner (System.in);
		int n=ran.nextInt(1001);
		System.out.format("Number: %d\n",n);
		while (true){
			int guess=input.nextInt();
			if (guess<n){
				System.out.println("Tebakan lebih kecil");
			}
			else if (guess>n){
				System.out.println("Tebakan lebih besar");
			}
			else{
				System.out.println("Tebakan tepat!");
				break;
			}
		}
	}
}