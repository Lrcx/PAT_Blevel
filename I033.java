package lowlevel;

import java.util.*;

public class I033 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String badkey=s.nextLine();
		String word=s.nextLine();
		char[] b=badkey.toCharArray();
		char[] w=word.toCharArray();
		boolean flag=true;
		for(int i=0;i<b.length;i++) {
			
			if(b[i]==','||b[i]=='.'||b[i]=='-'||b[i]=='+') {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<w.length;j++) {
					if((w[j]>=48||w[j]<=57)&&w[j]==b[i]) {
						w[j]='%';
					}else if(((w[j]>=65&&w[j]<=90)||(w[j]>=97&&w[j]<=122))&&(w[j]==b[i]||w[j]==b[j]+32)){
						w[j]='%';
					}else if(w[j]=='_'&&w[j]==b[i]){
						w[j]='%';
					}
				}
			}
		}else {
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<w.length;j++) {
					if((w[j]>=48||w[j]<=57)&&w[j]==b[i]) {
						w[j]='%';
					}else if((w[j]>=97&&w[j]<=122)&&(w[j]==b[i]+32)) {
						w[j]='%';
					}else if(w[j]=='_'&&w[j]==b[i]){
						w[j]='%';
					}else if(w[j]>=65&&w[j]<=90) {
						w[j]='%';
					}
				}
			}
		}
		for(int i=0;i<w.length;i++) {
			if(w[i]!='%') {
				System.out.print(w[i]);
			}
		}
	}
}
