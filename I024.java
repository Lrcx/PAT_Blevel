package lowlevel;

import java.util.*;

public class I024 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		ArrayList<Character> list=new ArrayList<Character>();
		char[] ch=str.toCharArray();
		int count_E=0;//字符E的位置
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='E') {
				count_E=i;
				break;
			}
		}
		
		int count_point=0;//小数点的位置
		String zhishu1="";
		for(int i=count_E+2;i<ch.length;i++) {
			zhishu1=zhishu1+ch[i];
		}
		int zhishu=Integer.parseInt(zhishu1);
//		int zhishu=(ch[count_E+2]-48)*10+ch[count_E+3]-48;//指数的大小
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='.') {
				count_point=i;
				break;
			}
		}
		
		
		if(ch[count_E+1]=='+') {
			if(zhishu==0) {
				for(int i=0;i<count_E;i++) {
					list.add(ch[i]);
				}
				if(list.get(0)=='+') {
					for(int i=1;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}
			}else{
				int count=count_E-count_point-1;
				int count_0=zhishu-count;
				for(int i=0;i<count_point;i++) {
					list.add(ch[i]);
				}
				for(int i=count_point+1;i<count_E;i++) {
					list.add(ch[i]);
				}
				for(int i=0;i<count_0;i++) {
					list.add('0');
				}
				if(list.get(0)=='+') {
					for(int i=1;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}
			}
			
			
		}else {
			int count=zhishu-1;
			if(zhishu==0) {
				if(ch[0]=='+') {
					for(int i=1;i<count_E;i++) {
						System.out.print(ch[i]);
					}
				}else {
					for(int i=0;i<count_E;i++) {
						System.out.print(ch[i]);
					}
				}
			}else if(zhishu==1){
				list.add(ch[0]);
				list.add('0');
				list.add('.');
				list.add(ch[1]);
				for(int i=count_point+1;i<count_E;i++) {
					list.add(ch[i]);
				}
				if(list.get(0)=='+'){
					for(int i=1;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}
			}
			else {
				list.add(ch[0]);
				list.add('0');
				list.add('.');
				for(int i=0;i<count;i++) {
					list.add('0');
				}
				list.add(ch[1]);
				for(int i=count_point+1;i<count_E;i++) {
					list.add(ch[i]);
				}
				if(list.get(0)=='+'){
					for(int i=1;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						System.out.print(list.get(i));
					}
				}
			}
		}
	}
}
