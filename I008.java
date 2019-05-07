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


/*总结
	1.要考虑输入的n和m的大小关系，考虑n-m大于等于小于0的情况
	2.考虑小于0的情况的时候要考虑m是n几倍的关系
*/


