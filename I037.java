package lowlevel;

import java.util.*;

public class I037 {
	public static void main(String[] args) {
		I037 pat=new I037();
		Scanner s=new Scanner(System.in);
		String P=s.next();
		String A=s.next();
		pat.wallet(P, A);
	}
	public void wallet(String P,String A) { //P应付的钱       A实付的钱
		String str1[]=P.split("\\."); //.转义字符，必须用\\.来区分
		String str2[]=A.split("\\.");
		long p=Long.parseLong(str1[0])*17*29+Long.parseLong(str1[1])*29+Long.parseLong(str1[2]);
		long a=Long.parseLong(str2[0])*17*29+Long.parseLong(str2[1])*29+Long.parseLong(str2[2]);
		long cha=p-a;
		if(cha<=0) {
			cha=-cha;
			long Galleon=cha/17/29;
			long Sickle=(cha-Galleon*17*29)/29;
			long Knut=cha-Galleon*17*29-Sickle*29;
			System.out.print(Galleon+"."+Sickle+"."+Knut);
		}else {
			long Galleon=cha/17/29;
			long Sickle=(cha-Galleon*17*29)/29;
			long Knut=cha-Galleon*17*29-Sickle*29;
			System.out.print("-"+Galleon+"."+Sickle+"."+Knut);
		}
	}
}
