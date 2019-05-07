package lowlevel;

import java.util.*;
import java.io.*;

public class I034 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String first[]=s.next().split("/");		//Integer.parseInt(first[0])
		String second[]=s.next().split("/");
		long first1=Integer.parseInt(first[0]);
		long first2=Integer.parseInt(first[1]);
		long second1=Integer.parseInt(second[0]);
		long second2=Integer.parseInt(first[1]);
		long k=0;
		if(Integer.parseInt(first[0])<0) {
			first1=-first1;
			long e=euclid(first1,first2);
			first1=first1/e;
			first2=first2/e;
			if(first1>=first2) {
				k=-(first1/first2);
				first1=first1+k*first2;
			}else {
				first1=-first1;
			}
			if(first1>=0) {
				if(first1==0) {
					System.out.print("("+k+")");
				}else {
					System.out.print("("+k+" "+first1+"/"+first2+")");
				}
			}else {
				System.out.print("("+first1+"/"+first2+")");
			}
		}else if(Integer.parseInt(first[0])>0) {
			long e=euclid(first1,first2);
			first1=first1/e;
			first2=first2/e;
			if(first1>=first2) {
				k=first1/first2;
				first1=first1-k*first2;
			}
		}
	}
	public static long euclid(long a,long b) {//欧几里得算法（辗转相除法）求最大公约数
		long temp=0;
		if(a<b) {
			temp=a;
			a=b;
			b=temp;
		}
		while(a%b!=0) {
			temp=a%b;
			a=b;
			b=temp;
		}
		return b;
	}
}
