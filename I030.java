package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I030 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);
        long p=Long.parseLong(str[1]);
        String[] st=br.readLine().split(" ");
        long nums[]=new long[N];
        for(int i=0;i<N;i++){
            nums[i]=Long.parseLong(st[i]);
        }
        Arrays.sort(nums);
        int max=0,result=0;
        for(int i=0;i<N;i++){
            for(int j=i+max;j<N;j++){
                if(nums[j]<=nums[i]*p){
                    result=j-i+1;
                    if(max<result)
                        max=result;
                }else
                    break;
            }
        }
        System.out.print(max);
    }
}
