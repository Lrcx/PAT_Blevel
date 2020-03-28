package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I041 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] id=new String[N];
        String[] shiji=new String[N];
        String[] kaoshi=new String[N];
        for(int i=0;i<N;i++){
            String[] str=br.readLine().split(" ");
            id[i]=str[0];
            shiji[i]=str[1];
            kaoshi[i]=str[2];
        }
        int M=Integer.parseInt(br.readLine());
        String[] compare=br.readLine().split(" ");

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(compare[i].equals(shiji[j])){
                    System.out.println(id[j]+" "+kaoshi[j]);
                    break;
                }
            }
        }
    }
}
