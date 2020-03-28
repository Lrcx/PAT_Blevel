package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I077 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);
        int M=Integer.parseInt(str[1]);
        for(int i=0;i<N;i++){
            String[] temp=br.readLine().split(" ");
            int[] scores=new int[N-1];
            for(int j=0;j<N-1;j++){
                scores[j]=Integer.parseInt(temp[j+1]);
            }
            Arrays.sort(scores);
            int count=0,sum=0,index1=0,index2=0;
            for(int j=0;j<N-2;j++){
                if(scores[j]>=0&&scores[j]<=M){
                    index1=j;
                    break;
                }
            }
            for(int j=N-2;j>=0;j--){
                if(scores[j]>=0&&scores[j]<=M){
                    index2=j;
                    break;
                }
            }
            for(int j=index1+1;j<index2;j++){
                sum+=scores[j];
                count++;
            }
            System.out.printf("%1.0f\n",(sum*1.0/count+Double.parseDouble(temp[0]))/2);
        }
    }
}
