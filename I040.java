package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I040 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] c=br.readLine().toCharArray();
        int count_P=0,count_A=0,count_T=0,result=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='T')
                count_T++;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]=='T') count_T--;
            if(c[i]=='P') count_P++;
            if(c[i]=='A') result=(result+(count_P*count_T)%1000000007)%1000000007;
        }
        System.out.print(result);
    }
}
