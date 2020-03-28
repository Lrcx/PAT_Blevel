package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I032 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int score[]=new int[N+1],id,fen;
        String[] str;
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            id=Integer.parseInt(str[0]);
            fen=Integer.parseInt(str[1]);
            score[id]+=fen;
        }
        br.close();
        int max_score=score[1],index=1;
        for(int i=2;i<=N;i++){
            if(max_score<score[i]){
                max_score=score[i];
                index=i;
            }
        }

        System.out.print(index+" "+max_score);
    }
}