package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I063 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int max=0;
        for(int i=0;i<N;i++){
            String[] str=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            int temp=a*a+b*b;
            if(max<temp)
                max=temp;
        }
        System.out.printf("%.2f",Math.sqrt(max));
    }
}
