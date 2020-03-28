package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        for(int i=4;i<=N;i++){
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        int pnums[]=new int[list.size()];
        for(int i=0;i<pnums.length;i++){
            pnums[i]=list.get(i);
        }
        int count=0;
        for(int i=0;i<pnums.length-1;i++){
            if(pnums[i+1]-pnums[i]==2){
                count++;
            }
        }
        System.out.print(count);
    }
}
