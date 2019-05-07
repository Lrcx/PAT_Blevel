package lowlevel;

import java.text.*;
import java.util.*;
//可能是一边输入一边做操作导致运行超时，改
public class I028 {
	public static void main(String[] args) throws ParseException  {
		Scanner s=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		String n=s.nextLine();
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<Integer.parseInt(n);i++) {
			String str=s.nextLine();
			String[] chai=str.split(" ");
			Date date=sdf.parse(chai[1]);
			if(date.before(sdf.parse("2014/09/06"))||date.equals(sdf.parse("2014/09/06"))) {
				if(date.after(sdf.parse("1814/09/06"))||date.equals(sdf.parse("1814/09/06"))) {
					list.add(str);
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i).split(" ")[0].toCharArray().length>5) {
				list.remove(i);
			}
		}
		System.out.print(list.size()+" ");
		String b[]=new String[list.size()];
		for(int i=0;i<list.size();i++) {
			b[i]=list.get(i);
		}
		
		if(list.size()==1) {
			System.out.print(list.get(0).split(" ")[0]+" "+list.get(0).split(" ")[0]);
		}else {
			for(int i=0;i<=list.size()-1;i++) {
				String st="";
				
				for(int j=i+1;j<list.size();j++) {
					String[] chai=b[i].split(" ");
					if(sdf.parse(chai[1]).after(sdf.parse(b[j].split(" ")[1]))) {
						st=b[i];
						b[i]=b[j];
						b[j]=st;
					}
				}
			}
			System.out.print(b[0].split(" ")[0]+" ");
			for(int i=0;i<=list.size()-1;i++) {
				String st="";
				for(int j=i+1;j<list.size();j++) {
					String[] chai=b[i].split(" ");
					if(sdf.parse(chai[1]).before(sdf.parse(b[j].split(" ")[1]))) {
						st=b[i];
						b[i]=b[j];
						b[j]=st;
					}
				}
			}
			System.out.print(b[0].split(" ")[0]);
			
		}
		
		
	}
}
