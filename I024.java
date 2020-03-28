package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I024 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split("E");//按照E拆分成两部分
        char[] c=str[0].toCharArray();//左边化成字符数组
        int D=Integer.parseInt(str[1]);//右边化成int型数据
        //如果D是0，除了符号位其它原样输出
        if(D==0){
            if(c[0]=='-'){
                System.out.print(c[0]);
            }
            for(int i=1;i<c.length;i++){
                System.out.print(c[i]);
            }
            return;
        }

        //D>0，小数点右移
        if(D>0){
            if(c[0]=='-'){//先判断符号位是+还是-
                System.out.print(c[0]);
            }
            //输出c[1]
            System.out.print(c[1]);
            //count表明最后边填0的个数，可以是负数
            int count=D-(c.length-3);//为什么是减3，符号位 整数部分 小数点一共三位
            //i=3是小数点后的第一位
            for(int i=3;i<c.length;i++){
                //其它部分照常输出
                System.out.print(c[i]);
                //如果满足这个条件输出一个小数点
                if(i==D+2&&i!=c.length-1){
                    System.out.print(".");
                }
            }
            //如果count是负数，那么这个循环就不执行了
            for(int i=0;i<count;i++){
                System.out.print("0");
            }
        }else if(D<0){//D<0按照我给的步骤一步一步来就行了
            D=-D;
            if(c[0]=='-'){
                System.out.print(c[0]);
            }
            System.out.print("0.");
            int count=D-1;
            for(int i=0;i<count;i++){
                System.out.print("0");
            }
            for(int i=1;i<c.length;i++){
                if(i!=2){
                    System.out.print(c[i]);
                }
            }
        }
    }
}
