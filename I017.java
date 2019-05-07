package lowlevel;

import java.util.*;

public class I017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		String str=s.nextLine();
		if(str.length()<4) {
			for(int i=str.length();i<4;i++) {
				str=str+"0";
			}
		}
		char a[]=str.toCharArray();
		
		char t;
		boolean target=true;
		for(int i=1;i<a.length;i++) {
			if(a[0]!=a[i]) {
				target=false;
			}
		}
		if(target==true) {
			System.out.print(Integer.parseInt(str)+" - "+Integer.parseInt(str)+" = "+"0000");
		}else {
			String max="";
			String min="";
			int sum=0;
//			if(!(max.equals("")||min.equals(""))){
				while(sum!=6174) {
					//最大排序
					for(int i=0;i<a.length-1;i++) {
						for(int j=i;j<a.length;j++) {
							if(a[i]<a[j]) {
								t=a[i];
								a[i]=a[j];
								a[j]=t;
							}
						}
					}
					
					for(int i=0;i<a.length;i++) {
						max=max+a[i];
					}
					//最小排序
					for(int i=0;i<a.length-1;i++) {
						for(int j=i;j<a.length;j++) {
							if(a[i]>a[j]) {
								t=a[i];
								a[i]=a[j];
								a[j]=t;
							}
						}
					}
					
					for(int i=0;i<a.length;i++) {
						min=min+a[i];
					}
					
//					char[] min_=min.toCharArray();
					sum=Integer.parseInt(max)-Integer.parseInt(min);
					System.out.print(max+" - "+min+" = "+sum);
					list.add(sum);
					boolean flag=true;
					for(int i=0;i<list.size();i++) {
						if(list.get(i)==6174) {
							flag=false;
						}
					}
					if(flag==true) {
						System.out.println();
					}
					max="";
					min="";
					a=String.valueOf(sum).toCharArray();
				}
				
			}
//			}
			
	}

}
