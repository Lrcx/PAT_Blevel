package lowlevel;

import java.util.*;

public class I036 {
	public static void main(String[] args) {
		I036 pat =new I036();
		Scanner s=new Scanner(System.in);
		double N=s.nextDouble();
		String sign=s.next();
		pat.squarePaint(N, sign);
	}
	public void squarePaint(double n,String s) {
		int a=(int) Math.round(n/2);
			for(int i=0;i<n;i++) {
				System.out.print(s);
			}
			System.out.println();
			for(int i=0;i<a-2;i++) {
				System.out.print(s);
				for(int m=0;m<n-2;m++) {
					System.out.print(" ");
				}
				System.out.println(s);
			}
			for(int i=0;i<n;i++) {
				System.out.print(s);
			}
		}
}
