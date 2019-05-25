package lowlevel;

import java.util.*;

public class I038 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Integer> list3=new ArrayList<Integer>();
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			list1.add(s.nextInt());
		}
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			list2.add(s.nextInt());
		}
		for(int i=0;i<list2.size();i++) {
			int count=0;
			for(int j=0;j<list1.size();j++) {
				if(list2.get(i)==list1.get(j)) {
					count++;
				}
			}
			list3.add(count);
		}
		for(int i=0;i<list3.size();i++) {
			if(i==list3.size()-1) {
				System.out.print(list3.get(i));
			}else {
				System.out.print(list3.get(i)+" ");
			}
		}
	}
}
