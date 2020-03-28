package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I070 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int nums[]=new int[N];
        for(int i=0;i<N;i++)
            nums[i]=Integer.parseInt(str[i]);
        Arrays.sort(nums);
        double result=nums[0];
        for(int i=1;i<N;i++){
            result=(result+nums[i])/2;
        }
        System.out.println((int)result);
    }
}
