package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I060 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int i=0;
        for(i=N;i>0;i--){
            int count=0;
            for(int j=0;j<N;j++){
                if(Integer.parseInt(str[j])>i)
                    count++;
            }
            if(count>=i)
                break;
        }
        System.out.println(i);
    }
}
