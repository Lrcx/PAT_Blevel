package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I066 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int M=Integer.parseInt(str[0]);
        int N=Integer.parseInt(str[1]);
        int A=Integer.parseInt(str[2]);
        int B=Integer.parseInt(str[3]);
        int replace=Integer.parseInt(str[4]);
        for(int i=0;i<M;i++){
            String temp[]=br.readLine().split(" ");
            for(int j=0;j<N;j++){
                if(j!=0)
                    System.out.print(" ");
                int px=Integer.parseInt(temp[j]);
                if(px<A||px>B)
                    System.out.printf("%03d",px);
                else
                    System.out.printf("%03d",replace);
            }
            System.out.println();
        }
    }
}
