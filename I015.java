//程序应该是没有多大问题，PAT三个运行超时，牛客网全部运行超时
package lowlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class I015 {
	public static void main(String[] args) throws Exception {
//		Scanner s=new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line_1=in.readLine();
		int N=Integer.parseInt(line_1.split(" ")[0]);//考生总数                          准考证号 德分 才分
		int L=Integer.parseInt(line_1.split(" ")[1]);//最低分数线
		int H=Integer.parseInt(line_1.split(" ")[2]);//优先录取线
		String stu[]=new String[N];
		ArrayList<String> list1=new ArrayList<String>();//才德兼备 >=H 德才总分排序
		ArrayList<String> list2=new ArrayList<String>();//德胜才	德>=H，但才<H
		ArrayList<String> list3=new ArrayList<String>();//才德兼亡，但德胜才 德才均《H，但德》才
		ArrayList<String> list4=new ArrayList<String>();//才德兼亡 
		//输入数据
		for(int i=0;i<N;i++) {
			stu[i]=in.readLine();
		}
		//对德才进行分类划分
		for(int i=0;i<N;i++) {
			stu[i].split(" ");
			if(Integer.parseInt(stu[i].split(" ")[1])<L||Integer.parseInt(stu[i].split(" ")[2])<L) {
				stu[i]="0";
			}
			if(stu[i]!="0") {
				if(Integer.parseInt(stu[i].split(" ")[1])>=H&&Integer.parseInt(stu[i].split(" ")[2])>=H) {
					list1.add(stu[i]);
				}else if(Integer.parseInt(stu[i].split(" ")[1])>=H&&Integer.parseInt(stu[i].split(" ")[2])<H) {
					list2.add(stu[i]);
				}else if(Integer.parseInt(stu[i].split(" ")[1])<H) {
					if(Integer.parseInt(stu[i].split(" ")[1])>=Integer.parseInt(stu[i].split(" ")[2])){
						list3.add(stu[i]);
					}else {
						list4.add(stu[i]);
					}
				}
			}
		}
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
//		System.out.println();
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i));
//		}
//		System.out.println();
//		for(int i=0;i<list3.size();i++) {
//			System.out.println(list3.get(i));
//		}
//		System.out.println();
//		for(int i=0;i<list4.size();i++) {
//			System.out.println(list4.get(i));
//		}
		String a[]=new String[list1.size()];
		String b[]=new String[list2.size()];
		String c[]=new String[list3.size()];
		String d[]=new String[list4.size()];
		if(list1.size()>0) {
			for(int i=0;i<list1.size();i++) {
				a[i]=list1.get(i)+" "+(Integer.parseInt(list1.get(i).split(" ")[1])+
						Integer.parseInt(list1.get(i).split(" ")[2]));
			}
		}
		if(list2.size()>0) {
			for(int i=0;i<list2.size();i++) {
				b[i]=list2.get(i)+" "+(Integer.parseInt(list2.get(i).split(" ")[1])+
						Integer.parseInt(list2.get(i).split(" ")[2]));
			}
		}
		if(list3.size()>0) {
			for(int i=0;i<list3.size();i++) {
				c[i]=list3.get(i)+" "+(Integer.parseInt(list3.get(i).split(" ")[1])+
						Integer.parseInt(list3.get(i).split(" ")[2]));
			}
		}
		if(list4.size()>0) {
			for(int i=0;i<list4.size();i++) {
				d[i]=list4.get(i)+" "+(Integer.parseInt(list4.get(i).split(" ")[1])+
						Integer.parseInt(list4.get(i).split(" ")[2]));
			}
		}
		//对a[]进行排序
		for(int i=0;i<a.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<a.length;j++) {
				if(Integer.parseInt(a[i].split(" ")[3])<Integer.parseInt(a[j].split(" ")[3])) {
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for(int i=0;i<a.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<a.length;j++) {
				if(Integer.parseInt(a[i].split(" ")[3])==Integer.parseInt(a[j].split(" ")[3])) {
					if(Integer.parseInt(a[i].split(" ")[1])<Integer.parseInt(a[j].split(" ")[1])) {
						tmp=a[i];
						a[i]=a[j];
						a[j]=tmp;
					}else if(Integer.parseInt(a[i].split(" ")[1])==Integer.parseInt(a[j].split(" ")[1])) {
						if(Integer.parseInt(a[i].split(" ")[0])>Integer.parseInt(a[j].split(" ")[0])) {
							tmp=a[i];
							a[i]=a[j];
							a[j]=tmp;
						}
					}
				}
			}
		}
		//对b[]进行排序
		for(int i=0;i<b.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<b.length;j++) {
				if(Integer.parseInt(b[i].split(" ")[3])<Integer.parseInt(b[j].split(" ")[3])) {
					tmp=b[i];
					b[i]=b[j];
					b[j]=tmp;
				}
			}
		}
		for(int i=0;i<b.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<b.length;j++) {
				if(Integer.parseInt(b[i].split(" ")[3])==Integer.parseInt(b[j].split(" ")[3])) {
					if(Integer.parseInt(b[i].split(" ")[1])<Integer.parseInt(b[j].split(" ")[1])) {
						tmp=b[i];
						b[i]=b[j];
						b[j]=tmp;
					}else if(Integer.parseInt(b[i].split(" ")[1])==Integer.parseInt(b[j].split(" ")[1])) {
						if(Integer.parseInt(b[i].split(" ")[0])>Integer.parseInt(b[j].split(" ")[0])) {
							tmp=b[i];
							b[i]=b[j];
							b[j]=tmp;
						}
					}
				}
			}
		}
		//对c进行排序
		for(int i=0;i<c.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<c.length;j++) {
				if(Integer.parseInt(c[i].split(" ")[3])<Integer.parseInt(c[j].split(" ")[3])) {
					tmp=c[i];
					c[i]=c[j];
					c[j]=tmp;
				}
			}
		}
		for(int i=0;i<c.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<c.length;j++) {
				if(Integer.parseInt(c[i].split(" ")[3])==Integer.parseInt(c[j].split(" ")[3])) {
					if(Integer.parseInt(c[i].split(" ")[1])<Integer.parseInt(c[j].split(" ")[1])) {
						tmp=c[i];
						c[i]=c[j];
						c[j]=tmp;
					}else if(Integer.parseInt(c[i].split(" ")[1])==Integer.parseInt(c[j].split(" ")[1])) {
						if(Integer.parseInt(c[i].split(" ")[0])>Integer.parseInt(c[j].split(" ")[0])) {
							tmp=c[i];
							c[i]=c[j];
							c[j]=tmp;
						}
					}
				}
			}
		}
		//对d进行排序
		for(int i=0;i<d.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<d.length;j++) {
				if(Integer.parseInt(d[i].split(" ")[3])<Integer.parseInt(d[j].split(" ")[3])) {
					tmp=d[i];
					d[i]=d[j];
					d[j]=tmp;
				}
			}
		}
		for(int i=0;i<d.length-1;i++) {
			String tmp="";
			for(int j=i+1;j<d.length;j++) {
				if(Integer.parseInt(d[i].split(" ")[3])==Integer.parseInt(d[j].split(" ")[3])) {
					if(Integer.parseInt(d[i].split(" ")[1])<Integer.parseInt(d[j].split(" ")[1])) {
						tmp=d[i];
						d[i]=d[j];
						d[j]=tmp;
					}else if(Integer.parseInt(d[i].split(" ")[1])==Integer.parseInt(d[j].split(" ")[1])) {
						if(Integer.parseInt(d[i].split(" ")[0])>Integer.parseInt(d[j].split(" ")[0])) {
							tmp=d[i];
							d[i]=d[j];
							d[j]=tmp;
						}
					}
				}
			}
		}
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<a.length;i++) {
			list.add(a[i].split(" ")[0]+" "+a[i].split(" ")[1]+" "+a[i].split(" ")[2]);
		}
		for(int i=0;i<b.length;i++) {
			list.add(b[i].split(" ")[0]+" "+b[i].split(" ")[1]+" "+b[i].split(" ")[2]);
		}
		for(int i=0;i<c.length;i++) {
			list.add(c[i].split(" ")[0]+" "+c[i].split(" ")[1]+" "+c[i].split(" ")[2]);
		}
		for(int i=0;i<d.length;i++) {
			list.add(d[i].split(" ")[0]+" "+d[i].split(" ")[1]+" "+d[i].split(" ")[2]);
		}
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
			if(i!=list.size()) {
				System.out.println();
			}
		}
	}
}
