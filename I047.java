package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I047 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int scores[]=new int[1001];
        String[] str=new String[N];
        for(int i=0;i<N;i++)
            str[i]=br.readLine();

        for(int i=0;i<N;i++){
            String temp[]=str[i].split(" ");
            String[] id=temp[0].split("-");
            scores[Integer.parseInt(id[0])]+=Integer.parseInt(temp[1]);
        }

        int max=0,index=0;
        for(int i=0;i<1001;i++){
            if(max<scores[i]){
                max=scores[i];
                index=i;
            }
        }

        System.out.print(index+" "+max);
    }
}
