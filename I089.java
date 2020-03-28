package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class I089 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int wolf[]=new int[N+1];
        for(int i=0;i<N;i++)
            wolf[i+1]=Integer.parseInt(br.readLine());
        br.close();
        for(int i=1;i<N;i++){
            for(int j=i+1;j<=N;j++){
                int a[]=new int[N+1];
                Arrays.fill(a,1);
                a[i]=-1;a[j]=-1;
                ArrayList<Integer> lie=new ArrayList<>();
                for(int k=1;k<=N;k++)
                    if(wolf[k]*a[Math.abs(wolf[k])]<0)
                        lie.add(k);
                if(lie.size()==2&&a[lie.get(0)]+a[lie.get(1)]==0){
                    System.out.print(i+" "+j);
                    return;
                }
            }
        }
        System.out.println("No Solution");
    }
}
