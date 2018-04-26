import java.util.*;
import java.lang.*;
class e {
	public static void main (String[] args) throws java.lang.Exception{
		Scanner input=new Scanner(System.in);
		Random ran=new Random();
		int ans,correct=0;
		for (int i=1;i<=10;i++){
			int a=ran.nextInt(9)+1, b=ran.nextInt(9)+1;
			System.out.format("Pertanyaan %d: %d * %d = ",i,a,b);
			ans=input.nextInt();
			if (ans==a*b){
				correct+=1;
				System.out.println("Jawaban benar");
			}
			else{
				System.out.println("Jawaban salah");
			}
		}
		System.out.format("Skor Anda: %d benar dari 10 pertanyaan\n",correct);
	}
}