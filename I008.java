package lowlevel;


import java.util.*;

public class I008 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int move=n-m;
		if(move==0) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);
				if(i!=a.length-1) {
					System.out.print(" ");
				}
			}
			
		}else {
			int sha=m/n;
			if(move<0) {
				move=sha*n+move;
			}
			int temp;
			for(int i=0;i<=(move-1)/2;i++) {
				temp=a[i];
				a[i]=a[move-i-1];
				a[move-i-1]=temp;
			}
			
			for(int i=move;i<=(move-1+n)/2;i++) {
				temp=a[i];
				a[i]=a[n-i+move-1];
				a[n-i+move-1]=temp;
			}
			
			for(int i=0;i<=(n-1)/2;i++) {
				temp=a[i];
				a[i]=a[n-i-1];
				a[n-i-1]=temp;
			}
			for(int i=0;i<n;i++) {
				System.out.print(a[i]);
				if(i!=n-1) {
					System.out.print(" ");
				}
			}
		}
	}
}


/*�ܽ�
	1.Ҫ���������n��m�Ĵ�С��ϵ������n-m���ڵ���С��0�����
	2.����С��0�������ʱ��Ҫ����m��n�����Ĺ�ϵ
*/


