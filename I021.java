package lowlevel;

import java.util.*;

public class I021 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		String str=s.next();
		char a[]=str.toCharArray();
		int num[]= {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<a.length;i++) {
			switch (a[i]-48) {
			case 0:num[0]++;break;
			case 1:num[1]++;break;
			case 2:num[2]++;break;
			case 3:num[3]++;break;
			case 4:num[4]++;break;
			case 5:num[5]++;break;
			case 6:num[6]++;break;
			case 7:num[7]++;break;
			case 8:num[8]++;break;
			case 9:num[9]++;break;
			default:
				break;
			}
		}
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
				list.add(i+":"+num[i]);
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
			if(i!=list.size()-1) {
				System.out.println();
			}
		}
	}
}
