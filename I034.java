package levelB;

import java.util.*;

public class I034 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String first[]=s.next().split("/");//录入第一个分数
        String second[]=s.next().split("/");//录入第二个
        long first1=Long.parseLong(first[0]);//得到第一个分数分子
        long first2=Long.parseLong(first[1]);//第一个分数分母
        long second1=Long.parseLong(second[0]);//第二个分数分子
        long second2=Long.parseLong(second[1]);//第二个分数分母
        I034 main=new I034();
        long t=first2*second2;//分母通分
        long left=first1*second2;//通分后左边的分子
        long right=first2*second1;//通分后右边的分子
        long cheng=first1*second1;

        //加法
        System.out.print(main.format(first1, first2));System.out.print(" "+"+"+" ");
        System.out.print(main.format(second1, second2));System.out.print(" "+"="+" ");
        long a1=left+right;System.out.print(main.format(a1, t));System.out.println();

        //减法
        System.out.print(main.format(first1, first2));System.out.print(" "+"-"+" ");
        System.out.print(main.format(second1, second2));System.out.print(" "+"="+" ");
        long a2=left-right;System.out.print(main.format(a2, t));System.out.println();

        //乘法
        System.out.print(main.format(first1, first2));System.out.print(" "+"*"+" ");
        System.out.print(main.format(second1, second2));System.out.print(" "+"="+" ");
        System.out.print(main.format(cheng, t));System.out.println();

        //除法
        System.out.print(main.format(first1, first2));System.out.print(" "+"/"+" ");
        System.out.print(main.format(second1, second2));System.out.print(" "+"="+" ");
        if(main.format(second1, second2).equals("0")) {
            System.out.print("Inf");
        }else {
            if (right<0) {
                right=-right;
                left=-left;
            }
            System.out.print(main.format(left, right));
        }
    }
    /*欧几里得算法（辗转相除法）求最大公约数 6/4 6和4的最大公约数为2
    6/2=3 4/2=2 则最简形式为3/2 这个方法要会*/
    public static long euclid(long a,long b) {
        long temp=0;
        if(a<b) {
            temp=a;a=b;b=temp;//交换a b顺序，保证a>b
        }
        while(a%b!=0) {
            temp=a%b;a=b;b=temp;
        }
        return b;
    }
    public String format(long first1,long first2) {
        long k=0;
        if(first1<0) {//输出括号的情况
            first1=-first1;//分子变成证书
            long e=euclid(first1,first2);//得到分子分母的最大公约数
            first1=first1/e;//分子最简形式
            first2=first2/e;//分母最简形式
            if(first1>=first2) {
                k=-(first1/first2);
                first1=first1+k*first2; //注意k是负数 所以+
            }else {
                first1=-first1;
            }
            if(first1>=0) {
                if(first1==0) {
                    return "("+k+")";
                }else {
                    return "("+k+" "+first1+"/"+first2+")";
                }
            }else {
                return "("+first1+"/"+first2+")";
            }
        }else if(first1>0) {//不用输出括号
            long e=euclid(first1,first2);
            first1=first1/e;
            first2=first2/e;
            if(first1>=first2) {
                k=first1/first2;//得到整数部分
                first1=first1-k*first2;
                if(first1==0) {
                    return String.valueOf(k);
                }else {
                    return k+" "+first1+"/"+first2;
                }

            }else {
                return first1+"/"+first2;
            }
        }else {
            return "0";
        }
    }
}
