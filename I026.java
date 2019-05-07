package lowlevel;

import java.util.*;

public class I026 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double time_begin=s.nextDouble();
		double time_over=s.nextDouble();
		double cha=Math.round((time_over-time_begin)/100);
//		System.out.println(cha);
		int hour=(int)cha/3600;
		int minute=((int)cha-hour*3600)/60;
		int second=(int)cha-hour*3600-minute*60;
		if(hour<=9) {
			System.out.print("0"+hour+":");
		}else {
			System.out.print(hour+":");
		}
		if(minute<=9) {
			System.out.print("0"+minute+":");
		}else {
			System.out.print(minute+":");
		}
		if(second<=9) {
			System.out.print("0"+second);
		}else {
			System.out.print(second);
		}
		
	}
}
