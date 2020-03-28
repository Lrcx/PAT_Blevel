package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int count_jia[]=new int[3];//甲的获胜次数，数组从左到右代表J C B
        int count_yi[]=new int[3];
        int ping=0;

        for(int i=0;i<N;i++){
            char[] c=br.readLine().toCharArray();
            char jia=c[0];
            char yi=c[2];
            if(jia=='C'){
                if(yi=='C'){
                    ping++;
                }else if(yi=='B'){
                    count_yi[2]++;
                }else{
                    count_jia[1]++;
                }
            }else if(jia=='B'){
                if(yi=='B'){
                    ping++;
                }else if(yi=='C'){
                    count_jia[2]++;
                }else{
                    count_yi[0]++;
                }
            }else{
                if(yi=='J'){
                    ping++;
                }else if(yi=='B'){
                    count_jia[0]++;
                }else{
                    count_yi[1]++;
                }
            }
        }
        System.out.println(count_jia[0]+count_jia[1]+count_jia[2]+" "+ping+" "+(N-ping-(count_jia[0]+count_jia[1]+count_jia[2])));
        System.out.println(count_yi[0]+count_yi[1]+count_yi[2]+" "+ping+" "+(N-ping-(count_yi[0]+count_yi[1]+count_yi[2])));
        int max=0,index=0;
        for(int i=0;i<3;i++){
            if(max<=count_jia[i]){
                max=count_jia[i];
                index=i;
            }
        }
        switch(index){
            case 0:System.out.print("J ");break;
            case 1:System.out.print("C ");break;
            case 2:System.out.print("B ");break;
        }

        max=0;index=0;
        for(int i=0;i<3;i++){
            if(max<=count_yi[i]){
                max=count_yi[i];
                index=i;
            }
        }
        switch(index){
            case 0:System.out.print("J");break;
            case 1:System.out.print("C");break;
            case 2:System.out.print("B");break;
        }
    }
}