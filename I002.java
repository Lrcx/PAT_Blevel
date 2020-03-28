package levelB;

import java.util.Scanner;

public class I002 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num=s.next();//num用来接收输入的数字，由于输入的数字很大，
        // 超过了int、long的范围，这里用String来接收
        char[] single=num.toCharArray();//num中的每一个数字都被拆分开，放到single数组中
        //计算求和
        int sum=0;//和放在sum中
        for(int i=0;i<single.length;i++){
            sum+=single[i]-48;
        }
        //将整型sum转换为String类型的he
        String he=String.valueOf(sum);
        //把he的每一位存放到char类型的数组中
        char wei[]=he.toCharArray();
        for(int i=0;i<wei.length;i++){
            switch(wei[i]){
                case '0':
                    System.out.print("ling");break;
                case '1':
                    System.out.print("yi");break;
                case '2':
                    System.out.print("er");break;
                case '3':
                    System.out.print("san");break;
                case '4':
                    System.out.print("si");break;
                case '5':
                    System.out.print("wu");break;
                case '6':
                    System.out.print("liu");break;
                case '7':
                    System.out.print("qi");break;
                case '8':
                    System.out.print("ba");break;
                case '9':
                    System.out.print("jiu");break;
            }
            //如果没有到最后一位，统统输出空格
            if(i!=wei.length-1){
                System.out.print(" ");
            }
        }
    }
}
