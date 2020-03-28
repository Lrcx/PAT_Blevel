package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I013 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        int num=5;
        int count=2;
        if(N>2){
            while(count<N){
                if(num%6!=1&&num%6!=5){
                    num++;
                    continue;
                }
                boolean flag=true;
                for(int i=5;i<=Math.sqrt(num);i+=6){
                    if(num%i==0||num%(i+2)==0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    list.add(num);
                    count++;
                }
                num++;
            }
        }
        count=0;
        for(int i=M-1;i<N;i++){
            System.out.print(list.get(i));
            count++;
            if(count%10==0){
                System.out.println();
            }else{
                if(i!=N-1){
                    System.out.print(" ");
                }
            }
        }
    }
}
