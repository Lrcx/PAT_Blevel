package lowlevel;

import java.util.*;

public class I022 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		int A=s.nextInt();
		int B=s.nextInt();
		int D=s.nextInt();
		int sum=A+B;
		int shang=1;
		while(shang!=0) {
			int yu=sum%D;
			shang=sum/D;
			list.add(yu);
			sum=shang;
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}
	}
}
