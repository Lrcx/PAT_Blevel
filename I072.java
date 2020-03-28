package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I072 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);//学生人数
        int M=Integer.parseInt(str[1]);//被查缴的物品数
        int[] wrong=new int[10000];//违禁物品
        String[] temp=br.readLine().split(" ");
        for(int i=0;i<M;i++)
            wrong[Integer.parseInt(temp[i])]=1;
        int people=0,count=0;
        for(int i=0;i<N;i++){
            String[] s=br.readLine().split(" ");
            ArrayList<String> list=new ArrayList<>();
            for(int j=2;j<s.length;j++){
                if(wrong[Integer.parseInt(s[j])]==1){
                    list.add(s[j]);
                    count++;
                }
            }
            if(list.size()!=0){
                people++;
                System.out.print(s[0]+": ");
                for(int j=0;j<list.size();j++){
                    System.out.print(list.get(j));
                    if(j!=list.size()-1)
                        System.out.print(" ");
                    else
                        System.out.println();
                }
            }
        }
        System.out.print(people+" "+count);
    }
}
