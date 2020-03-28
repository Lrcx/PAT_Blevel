package levelB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class I051 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double R1=s.nextDouble();
        double P1=s.nextDouble();
        double R2=s.nextDouble();
        double P2=s.nextDouble();
        double A1=R1*Math.cos(P1);
        double B1=R1*Math.sin(P1);
        double A2=R2*Math.cos(P2);
        double B2=R2*Math.sin(P2);

        //精确到两位小数
        double A=Math.round((A1*A2-B1*B2)*100)*1.0/100;
        double B=Math.round((A1*B2+B1*A2)*100)*1.0/100;

        if(B<0)
            System.out.printf("%.2f%.2fi",A,B);
        else //(B>=0)要额外输出一个加号
            System.out.printf("%.2f+%.2fi",A,B);
    }
}
