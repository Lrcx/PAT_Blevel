package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I093 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] c1=br.readLine().toCharArray();
        char[] c2=br.readLine().toCharArray();
        int[] flag=new int[127];
        for(int i=0;i<c1.length;i++){
            if(flag[c1[i]]==0)
                System.out.print(c1[i]);
            flag[c1[i]]++;
        }
        for(int i=0;i<c2.length;i++){
            if(flag[c2[i]]==0)
                System.out.print(c2[i]);
            flag[c2[i]]++;
        }
    }
}
