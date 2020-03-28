package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I075 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int first=Integer.parseInt(str[0]);
        int N=Integer.parseInt(str[1]);
        int K=Integer.parseInt(str[2]);
        int[] next=new int[100000];
        int[] data=new int[100000];
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            next[Integer.parseInt(str[0])]=Integer.parseInt(str[2]);
            data[Integer.parseInt(str[0])]=Integer.parseInt(str[1]);
        }
        br.close();
        ArrayList<Integer> list_fu=new ArrayList<>();
        ArrayList<Integer> list_ling=new ArrayList<>();
        ArrayList<Integer> list_K=new ArrayList<>();

        while(first!=-1){
            if(data[first]<0)
                list_fu.add(first);
            else if(data[first]>K)
                list_K.add(first);
            else
                list_ling.add(first);
            first=next[first];
        }

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(list_fu);
        list.addAll(list_ling);
        list.addAll(list_K);

        for(int i=0;i<list.size()-1;i++){
            System.out.printf("%05d %d %05d\n",list.get(i),data[list.get(i)],list.get(i+1));
        }
        System.out.printf("%05d %d -1\n",list.get(list.size()-1),data[list.get(list.size()-1)]);
    }
}
