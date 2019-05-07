package lowlevel;

import java.util.*;
//程序没毛病，但是运行超时
public class I032 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=s.nextInt();
		int[] arr=new int[2*n];
		for(int i=0;i<2*n;i++) {
			arr[i]=s.nextInt();
		}
		list.add(arr[0]);
		for(int i=2;i<arr.length;i+=2) {
			boolean flag=true;
			for(int j=0;j<list.size();j++) {
				if(arr[i]==list.get(j)) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				list.add(arr[i]);
			}
		}
		int sum=0;
		int t=0;
		int num=0;
		for(int i=0;i<list.size();i++) {
			for(int m=0;m<arr.length;m+=2) {
				if(arr[m]==list.get(i)) {
					sum=sum+arr[m+1];
				}
			}
			if(sum>t) {
				t=sum;
				num=list.get(i);
			}
			sum=0;
		}
		System.out.print(num+" "+t);
	}
}
