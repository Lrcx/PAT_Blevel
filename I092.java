package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I092 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);
        int M=Integer.parseInt(str[1]);
        int a[]=new int[N];
        for(int i=0;i<M;i++){
            String[] temp=br.readLine().split(" ");
            for(int j=0;j<temp.length;j++)
                a[j]+=Integer.parseInt(temp[j]);
        }
        int max=0;
        for(int i=0;i<N;i++)
            if(max<a[i])
                max=a[i];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++)
            if(a[i]==max)
                list.add(i);
        System.out.println(max);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+1);
            if(i!=list.size()-1)
                System.out.print(" ");
        }
    }
}