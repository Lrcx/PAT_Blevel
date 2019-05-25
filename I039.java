package lowlevel;

import java.util.*;

public class I039 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		char tz[]=str1.toCharArray();//定义摊主
		char xh[]=str2.toCharArray();//定义小红
		char c[]= {0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r
				,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,
				W,X,Y,Z};
		int count1[]= new int[62];
		int count2[]=new int[62];
		for(int i=0;i<count1.length;i++) {
			count1[i]=0;
			count2[i]=0;
		}
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<tz.length;j++) {
				if(c[i]==tz[j]) {
					count1[i]++;
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<xh.length;j++) {
				if(c[i]==xh[j]) {
					count2[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(count2));
	}
}
