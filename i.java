import java.util.*;
import java.lang.*;
class i {
	static int translate(char c){
		if ((int) c <65){
			return (int) c-48;
		}
		else{
			return (int) c-55;
		}
	}
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		
		String hex_input=input.nextLine();
		int maxidx=hex_input.length()-1;
		char[] hex=hex_input.toCharArray();
		
		Double dec=0.0;
		for (int i=maxidx;i>=0;i--){
			dec+=translate(hex[maxidx-i])*Math.pow(16,i);
		}
		System.out.format("%.0f\n",dec);
	}
}