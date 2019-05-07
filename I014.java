package lowlevel;

import java.util.*;

public class I014 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		String str3=s.nextLine();
		String str4=s.nextLine();
		ArrayList<Character> list=new ArrayList<Character>();
		int count=0;
		int count1=0;
		int count2=0;
		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		char[] a3=str3.toCharArray();
		char[] a4=str4.toCharArray();
		//星期
		for(int i=0;i<a1.length;i++) {
			for(int j=i;j<=i;j++) {
				if(a1[i]==a2[j] && a1[i]>='A'&&a1[i]<='G') {
					count=i;
					list.add(a1[i]);
					break;
				}
			}
			if(count!=0) {
				break;
			}
		}
		//小时
		for(int i=count+1;i<a1.length;i++) {
			for(int j=i;j<=i;j++) {
				if((a1[i]==a2[j])&&((a1[i]>='0'&&a1[i]<='9')||(a1[i]>='A' && a1[i]<='N'))) {
					count1++;
					list.add(a1[i]);
					break;
				}
			}
			if(count1!=0) {
				break;
			}
		}
		//分钟
		int minute_count=0;
		for(int i=0;i<a3.length;i++) {
			for(int j=i;j<=i;j++) {
				if((a3[i]==a4[j])&&((a3[i]>='a'&&a3[i]<='z')||(a3[i]>='A'&&a3[i]<='Z'))) {
//					list.add(a3[i]);
					count2++;
					minute_count=i;
					break;
				}
			}
			if(count2!=0) {
				break;
			}
		}
		char day[]= {'A','B','C','D','E','F','G'};
		int day_count=0;
		for(int i=0;i<day.length;i++) {
			if(list.get(0)==day[i]) {
				day_count=i+1;
				break;
			}
			
		}
		//输出小时
		char[] hour= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N'};
		int hour_count=0;
		for(int i=0;i<hour.length;i++) {
			if(hour[i]==list.get(1)) {
				 hour_count=i;
			}
			
		}
//		System.out.println(list.get(1));
		switch (day_count) {
		case 1:
			System.out.print("MON"+" ");
			break;
		case 2:
			System.out.print("TUE"+" ");
			break;
		case 3:
			System.out.print("WED"+" ");
			break;
		case 4:
			System.out.print("THU"+" ");
			break;
		case 5:
			System.out.print("FRI"+" ");
			break;
		case 6:
			System.out.print("SAT"+" ");
			break;
		case 7:
			System.out.print("SUN"+" ");
			break;	
		default:
			break;
		}
		if(hour_count<10) {
			System.out.print("0"+hour_count+":");
		}else {
			System.out.print(hour_count+":");
		}
		if(minute_count<10) {
			System.out.print("0"+minute_count);
		}else {
			System.out.print(minute_count);
		}
		
	}
}

