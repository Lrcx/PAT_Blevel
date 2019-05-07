package lowlevel;

import java.util.*;

public class I029 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		ArrayList<Character> list=new ArrayList<Character>();
		
		for(int i=0;i<c1.length;i++) {
			boolean flag=true;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {	
					flag=false;
					break;
				}
			}
			if(flag==true) {
				list.add(c1[i]);
			}
		}
		char ch[]=new char[list.size()];
		for(int i=0;i<list.size();i++) {
			ch[i]=list.get(i);
//			System.out.print(ch[i]+" ");
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=97&&ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
			}
		}
		for(int i=ch.length-1;i>0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(ch[i]==ch[j]) {
					ch[i]=0;
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=0) {
				System.out.print(ch[i]);
			}
		}
	}
}
