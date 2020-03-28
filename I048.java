package levelB;

import java.util.Scanner;

public class I048 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next(),B=s.next();

        //保证A和B的长度一样，不够的前面话补0
        int x=Math.abs(A.length()-B.length());
        String str="";
        for(int i=0;i<x;i++)
            str+="0";
        if(A.length()<B.length())
            A=str+A;
        else
            B=str+B;

        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        char[] a=String.valueOf(sb1.append(A).reverse()).toCharArray();
        char[] b=String.valueOf(sb1.append(B).reverse()).toCharArray();

        int temp=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                temp=(a[i]+b[i]-48-48)%13;
                if(temp<10)
                    sb.append(temp);
                else
                    switch (temp){
                        case 10:sb.append("J");break;
                        case 11:sb.append("Q");break;
                        case 12:sb.append("K");break;
                    }
            }else{
                temp=b[i]-a[i];
                if(temp<0)
                    temp+=10;
                sb.append(temp);
            }
        }

        System.out.print(sb.reverse());
    }
}
