import java.util.*;
import java.lang.*;
class k {
	static int[] notes={500,200,100,50,20,10,5,2,1};
	static int[] amt=new int[9];
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		int money=input.nextInt();
		for (int i=0;i<9;i++){
			if (money==0){
				break;
			}
			amt[i]=money/notes[i];
			money%=notes[i];
		}
		for (int i=0;i<9;i++){
			if (amt[i]!=0){
				System.out.format("%dx %d\n",amt[i],notes[i]);
			}
		}
	}
}