package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I071 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int T=Integer.parseInt(str[0]);
        int K=Integer.parseInt(str[1]);
        for(int i=0;i<K;i++){
            String[] temp=br.readLine().split(" ");
            int n1=Integer.parseInt(temp[0]);
            int b=Integer.parseInt(temp[1]);
            int t=Integer.parseInt(temp[2]);
            int n2=Integer.parseInt(temp[3]);
            if(t<=T){
                if((n2<n1&&b==0)||(n2>n1&&b==1)){
                    T+=t;
                    System.out.println("Win "+t+"!  Total = "+T+".");
                }else{
                    T-=t;
                    System.out.println("Lose "+t+".  Total = "+T+".");
                }
                if(T==0){
                    System.out.println("Game Over.");
                    break;
                }
            }else
                System.out.println("Not enough tokens.  Total = "+T+".");
        }
        br.close();
    }
}
