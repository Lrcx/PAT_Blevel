package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I065 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] couples=new int[100000];
        String[] str;int a,b;
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            a=Integer.parseInt(str[0]);
            b=Integer.parseInt(str[1]);
            couples[a]=b;
            couples[b]=a;
        }
        int M=Integer.parseInt(br.readLine());
        int[] check=new int[100000];
        String[] s=br.readLine().split(" ");
        for(int i=0;i<M;i++)
            check[Integer.parseInt(s[i])]=1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<100000;i++){
            if(check[i]!=0)
                if(check[couples[i]]==0)
                    list.add(i);
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            if(i!=0)
                System.out.print(" ");
            System.out.printf("%05d",list.get(i));
        }
    }
}