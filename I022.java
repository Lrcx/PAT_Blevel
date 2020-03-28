package levelB;

import java.util.Scanner;

public class I022 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //不需要知道A和B，直接求和就可以了
        int sum=s.nextInt()+s.nextInt();
        //D进制
        int D=s.nextInt();
        I022 pat=new I022();
        pat.radix(sum,D);
    }
    //这里定义一个方法，给一个十进制的数和D，输出D进制的数字
    //这个方法是十进制数转化为其它进制数常用的除K取余法
    public void radix(int sum,int D){
        if(sum==0){
            System.out.print(0);
            return;
        }
        StringBuilder sb=new StringBuilder();
        while(sum!=0){
            sb.append(sum%D);
            sum/=D;
        }
        System.out.println(sb.reverse());
    }
}
