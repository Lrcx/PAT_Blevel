package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I012 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int A1=0,A2=0,A3=0,A5=0;
        float A4=0,count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            int num=s.nextInt();
            if(num%5==0&&num%2==0){
                A1+=num;
            }else if(num%5==1){
                list.add(num);
            }else if(num%5==2){
                A3++;
            }else if(num%5==3){
                A4+=num;
                count++;
            }else if(num%5==4){
                if(num>A5){
                    A5=num;
                }
            }
        }

        if(A1==0){
            System.out.print("N ");
        }else{
            System.out.print(A1+" ");
        }

        if(list.size()==0){
            System.out.print("N ");
        }else{
            for(int i=0;i<list.size();i++){
                if(i%2==0){
                    A2+=list.get(i);
                }else{
                    A2-=list.get(i);
                }
            }
            System.out.print(A2+" ");
        }

        if(A3==0){
            System.out.print("N ");
        }else{
            System.out.print(A3+" ");
        }

        if (count == 0) {
            System.out.print("N ");
        }else{
            System.out.printf("%.1f ",A4/count);
        }

        if(A5==0){
            System.out.print("N");
        }else{
            System.out.print(A5);
        }
    }
}
