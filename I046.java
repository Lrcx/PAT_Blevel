package levelB;

import java.util.Scanner;

public class I046 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int count_jia=0,count_yi=0;

        for(int i=0;i<N;i++){
            boolean flag1=true,flag2=true;
            int jiahan=s.nextInt();
            int jiahua=s.nextInt();
            int yihan=s.nextInt();
            int yihua=s.nextInt();
            if(jiahan+yihan==jiahua){
                count_yi++;
                flag1=false;
            }
            if(jiahan+yihan==yihua){
                count_jia++;
                flag2=false;
            }
            if(!flag1&&!flag2){
                count_jia--;
                count_yi--;
            }
        }

        System.out.print(count_jia+" "+count_yi);
    }
}
