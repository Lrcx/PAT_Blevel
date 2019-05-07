package lowlevel;

import java.util.*;

public class I003 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++) {//如果N为零怎么办
			str[i]=s.next();
		}
		
		for(int i=0;i<str.length;i++) {
			int count=0;
			char c[]=str[i].toCharArray();
			for(int j=0;j<c.length;j++) {
				if(c[j]!='P'&&c[j]!='A'&&c[j]!='T') {
					str[i]="0";
					break;
				}
			}
			
		}//到这里都对
		for(int i=0;i<str.length;i++) {
			int count_p=0;
			int count_t=0;
			int pos_p=0;
			int pos_t=0;
			if(str[i].equals("0")) {
				System.out.println("NO");
			}else{
				char c[]=str[i].toCharArray();
				for(int j=0;j<c.length;j++) {
					if(c[j]=='P') {
						count_p++;
					}
					if(c[j]=='T') {
						count_t++;
					}
				}
				if(count_p==1&&count_t==1) {
					for(int m=0;m<c.length;m++) {
						if(c[m]=='P') {
							pos_p=m;
						}
						if(c[m]=='T') {
							pos_t=m;
						}
					}
					if(pos_p<=pos_t) {
						if(pos_t-pos_p==1) {
							System.out.println("NO");
						}
						else if(pos_t-pos_p==2) {
							if(pos_p==c.length-1-pos_t) {
								System.out.println("YES");
							}else {
								System.out.println("NO");
							}
						}else {
							if(pos_p*(pos_t-pos_p-1)==c.length-1-pos_t) {
								System.out.println("YES");
							}else {
								System.out.println("NO");
							}
						}
					}else {
						System.out.println("NO");
						
					}
					
				}else {
					System.out.println("NO");
					
				}
			}
			
		}
		
	}
}
