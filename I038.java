package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I038 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] temp=br.readLine().split(" ");
        String[] compare=br.readLine().split(" ");

        int counts[]=new int[101];
        for(int i=0;i<N;i++){
            counts[Integer.parseInt(temp[i])]++;
        }

        for(int i=1;i<compare.length;i++){
            if(i!=1)
                System.out.print(" ");
            System.out.print(counts[Integer.parseInt(compare[i])]);

        }
    }
}
