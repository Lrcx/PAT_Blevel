package lowlevel;

import java.util.*;

public class I031 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		ArrayList<Integer> list=new ArrayList<Integer>();
//		{7£¬9£¬10£¬5£¬8£¬4£¬2£¬1£¬6£¬3£¬7£¬9£¬10£¬5£¬8£¬4£¬2}
		list.add(7);list.add(9);list.add(10);list.add(5);list.add(8);list.add(4);list.add(2);list.add(1);list.add(6);
		list.add(3);list.add(7);list.add(9);list.add(10);list.add(5);list.add(8);list.add(4);list.add(2);
		String[] M= {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
		int count=0;
		int count1=0;
		ArrayList<String> list1=new ArrayList<String>();
		int num=0;
		String[] data=new String[Integer.valueOf(n)];
		if(Integer.parseInt(n)!=0) {
			for(int i=0;i<Integer.parseInt(n);i++) {
				data[i]=s.nextLine();
			}
			for(int i=0;i<Integer.parseInt(n);i++) {
				char c[]=data[i].toCharArray();
				if(c.length!=18) {
					count++;
					list1.add(data[i]);
				}else{
					boolean flag=true;
					for(int j=0;j<c.length-1;j++) {
						
						if(c[j]<48||c[j]>57) {
							count++;
							flag=false;
							list1.add(data[i]);
							break;
						}else {
							num=num+(c[j]-48)*list.get(j);
						}
					}
					if(flag==true) {
						int Z=num%11;
						if(!M[Z].equals(String.valueOf(c[17]-48))) {
							count++;
							list1.add(data[i]);
						}
					}
					num=0;
				}
			}
			if(count==0) {
				System.out.print("All passed");
			}else {
				for(int i=0;i<list1.size();i++) {
					System.out.print(list1.get(i));
					if(i!=list1.size()-1) {
						System.out.println();
					}
				}
			}
		}
	}
}
