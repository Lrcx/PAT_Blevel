package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I083 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int cha[]=new int[N];
        for(int i=0;i<N;i++){
            cha[Math.abs(i+1-Integer.parseInt(str[i]))]++;
        }
        for(int i=N-1;i>=0;i--){
            if(cha[i]>1)
                System.out.println(i+" "+cha[i]);
        }
    }
}
