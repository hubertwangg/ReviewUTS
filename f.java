import java.util.*;
import java.lang.*;
class f {
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		System.out.format("In:");
		int n=input.nextInt(),week=0,day=0;
		if (n<0){
			System.out.println("Input yang dimasukkan salah, jumlah hari harus positif");
		}
		else{
			week=n/7;
			day=n%7;
			if ((week!=0) && (day!=0)){
				System.out.format("Selama %d hari terdapat %d minggu dan %d hari\n",n,week,day);
			}
			else if (week!=0){
				System.out.format("Selama %d hari terdapat %d minggu\n",n,week);
			}
			else{
				System.out.format("Selama %d hari terdapat %d hari\n",n,n);
			}
		}
	}
}