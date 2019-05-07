package lowlevel;

import java.util.*;

public class I030 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int count=s.nextInt();//输入数列的个数
		int p=s.nextInt(); //参数P
		int[] a=new int[count];		
		for(int i=0;i<count;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int value=0;
		int value_=0;
		for(int i=0;i<a.length;i++) {
			value_++;
			for(int j=i+value;j<a.length;j++) {
				if(a[j]>a[i]*p) {
					break;
				}
				value++;
			}
			if(a.length-value_<=value) {
				break;
			}
		}
		System.out.println(value);
	}
}
