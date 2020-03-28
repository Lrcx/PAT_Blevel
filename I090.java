package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I090 {
    public static void main(String[] args) throws Exception{
        final int num=100000;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);
        int M=Integer.parseInt(str[1]);
        ArrayList<Integer> list[]=new ArrayList[num];
        for(int i=0;i<list.length;i++)
            list[i]=new ArrayList<>();
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            list[a].add(b);
            list[b].add(a);
        }
        for(int i=0;i<M;i++){
            String[] temp=br.readLine().split(" ");
            boolean flag=false;
            int a[]=new int[num];
            for(int j=1;j<temp.length;j++)
                a[Integer.parseInt(temp[j])]=1;
            for(int j=1;j<temp.length;j++){
                int m=Integer.parseInt(temp[j]);
                for(int k=0;k<list[m].size();k++){
                    if(a[list[m].get(k)]==1){
                        flag=true;
                        break;
                    }
                }
                if(flag) break;
            }
            System.out.println(flag?"No":"Yes");
        }
    }
}