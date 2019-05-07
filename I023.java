package lowlevel;

import java.util.*;

public class I023 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Character> list=new ArrayList<Character>();
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=s.nextInt();
		}
		int count=0;
		for(int i=1;i<10;i++) {
			if(a[i]!=0) {
				count=i;
				break;
			}
		}
		String str="";
		str=str+count;
//		System.out.print(count);
		for(int i=0;i<10;i++) {
			for(int j=0;j<a[i];j++) {
//				System.out.print(i);
				str=str+i;
			}
		}
//		System.out.println();
//		System.out.println(str);
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			list.add(c[i]);
		}
		char value=list.get(0);
		for(int i=1;i<c.length;i++) {
			if(list.get(i)==value) {
				list.remove(i);
				break;
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
}
