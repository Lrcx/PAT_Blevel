package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I049 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        float sum=0;
        for(int i=0;i<N;i++)
            sum+=Float.parseFloat(str[i])*(i+1)*(N-i);
        System.out.printf("%.2f",sum);
    }
}
