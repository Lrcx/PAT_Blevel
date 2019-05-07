package lowlevel;

import java.util.*;

public class I027 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String sign=s.next();
		int sum=0;
		int count=0;
		if(num==1) {
			System.out.println(sign);
			System.out.print("0");
		}else {
			for(int i=0;i<num;i++) {
				sum=sum+2*i+1;
				if((2*sum-1)>num) {
					count=i;
					sum=sum-(2*i+1);
					break;
				}
			}
			int t=count;
			for(int i=0;i<count-1;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				for(int m=2*count-1;m>=2*i+1;m--) {
					System.out.print(sign);
					
				}
				System.out.println();
			}
			for(int i=0;i<count;i++) {
				for(int j=i;j<count-1;j++) {
					System.out.print(" ");
				}
				for(int m=0;m<2*i+1;m++) {
					System.out.print(sign);
				}
				System.out.println();
			}
//			System.out.println(sum);
			System.out.print(num-2*sum+1);
		}
		
	}
}
