package lowlevel;

import java.text.DecimalFormat;
import java.util.*;

public class I020 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		DecimalFormat df=new DecimalFormat("#.00");
		int N=s.nextInt();//月饼的种类数
		int D=s.nextInt();//市场的最大需求量
		int counts[]=new int[N];//库存			3 20
		int sales[]=new int[N];//总售价			18 15 10
		for(int i=0;i<N;i++) {//				75 72 45
			counts[i]=s.nextInt();
		}
		for(int i=0;i<N;i++) {
			sales[i]=s.nextInt();
		}
		double singlePrice[]=new double[N];//单价
		for(int i=0;i<N;i++) {
			singlePrice[i]=(double)sales[i]/(double)counts[i];
		}
		double t;
		int pos[]=new int[N];
		for(int i=0;i<N;i++) {
			pos[i]=i;
		}
		for(int i=0;i<N-1;i++) {
			int middle=0;
			for(int j=i+1;j<N;j++) {
				if(singlePrice[i]<singlePrice[j]) {
					t=singlePrice[i];
					singlePrice[i]=singlePrice[j];
					singlePrice[j]=t;
					middle=pos[i];
					pos[i]=pos[j];
					pos[j]=middle;
				}
			}
		}
		int sum=0;
		for(int i=0;i<N;i++) {
			list.add(pos[i]);
			sum=sum+counts[pos[i]];
			if(sum>=D) {
				break;
			}
		}
		double total=0;
		int sum_=0;
		if(sum==D) {
			for(int i=0;i<list.size();i++) {
				total=total+sales[pos[i]];
			}
		}else {
			for(int i=0;i<list.size()-1;i++) {
				total=total+sales[pos[i]];
				sum_=sum_+counts[pos[i]];
			}
			total=total+(D-sum_)*singlePrice[list.size()-1];
			System.out.print(df.format(total));
		}
	}
}
