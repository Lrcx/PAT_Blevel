package lowlevel;
//牛客网全部通过，PAT格式错误
import java.util.*;

public class I035 {
	public static void main(String[] args) {
		I035 pat=new I035(); 
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=s.nextInt();
		}
		int temp[]=Arrays.copyOfRange(a, 0, N);
		String st="";
		for(int i=0;i<N;i++) {
			st=st+s.nextInt();
		}
		pat.Insertion(a, st);
//		pat.Merge(temp, st);
		
	}
	public void Insertion(int a[],String s) {
		ArrayList<String> list=new ArrayList<String>();
		for(int i=1;i<a.length;i++) {
			String str="";
			int temp=a[i];
			int j=i-1;
			while(j>=0&&a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			for(int m=0;m<a.length;m++) {
				str=str+a[m];
			}
			list.add(str);
		}
		int t=0;
		for(int i=0;i<list.size();i++) {
			if(s.equals(list.get(i))) {
				t=i+1;
			}
		}
		if(t!=0) {
			System.out.println("Insertion Sort");
		}
		String z="";
		if(t!=0) {
			char c[]=list.get(t).toCharArray();
			for(int i=0;i<c.length-1;i++) {
				z=z+String.valueOf(c[i])+" ";
			}
			z=z+c[c.length-1];
			System.out.print(z);
		}
	}
	public void Merge(int a[],String s) {
		ArrayList<String> list1=new ArrayList<String>();
		String str1="";
		if(a.length==1) {
			str1=str1+a[0];
			list1.add(str1);
		}else if(a.length==2) {
			Arrays.sort(a);
			str1=str1+a[0]+a[1];
			list1.add(str1);
		}else{
			//归并算法核心思想，精华绝对是精华啊
			int k=1;
			boolean flag=true;
			while(flag==true) {
				String str="";
				k=k*2;
				for(int i=0;i<a.length/k;i++) {
					Arrays.sort(a,i*k,(i+1)*k);
				}
				if(a.length%k!=0) {
					Arrays.sort(a,a.length/k*k,a.length);
				}
				if(a.length/k==0) {
					break;
				}
				for(int j=0;j<a.length;j++) {
					str=str+a[j];
				}
				list1.add(str);
			}
			String str2="";
			for(int j=0;j<a.length;j++) {
				str2=str2+a[j];
			}
			list1.add(str2);
		}
		int t=0;
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).equals(s)) {
				t=i+1;
				System.out.println("Merge Sort");
				break;
			}
		}
		String z="";
		if(t!=0) {
			char c[]=list1.get(t).toCharArray();
			for(int i=0;i<c.length-1;i++) {
				z=z+String.valueOf(c[i])+" ";
			}
			z=z+c[c.length-1];
			System.out.print(z);
		}
	}
}
