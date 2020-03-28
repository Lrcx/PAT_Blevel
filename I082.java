package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I082 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int max=0,min=10000;
        String maxID="",minID="";
        for(int i=0;i<N;i++){
            String[] str=br.readLine().split(" ");
            int sum=Integer.parseInt(str[1])*Integer.parseInt(str[1])+Integer.parseInt(str[2])*Integer.parseInt(str[2]);
            if(max<sum){
                max=sum;
                maxID=str[0];
            }
            if(min>sum){
                min=sum;
                minID=str[0];
            }
        }
        br.close();
        System.out.println(minID+" "+maxID);
    }
}
