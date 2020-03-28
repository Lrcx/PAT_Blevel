package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I069 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int M=Integer.parseInt(str[0]); //转发总量
        int N=Integer.parseInt(str[1]); //中奖间隔
        int S=Integer.parseInt(str[2]); //第一位中奖者编号
        String[] trans=new String[M];
        for(int i=0;i<trans.length;i++){
            trans[i]=br.readLine();
        }
        br.close();
        ArrayList<String> list=new ArrayList<>();
        if(trans.length>=S){
            list.add(trans[S-1]);
        }else{
            System.out.print("Keep going...");
            System.exit(1);
        }
        for(int i=S+N-1;i<trans.length;){
            boolean flag=true;
            for(int j=0;j<list.size();j++){
                if(trans[i].equals(list.get(j))){
                    flag=false;
                    i++;
                    break;
                }
            }
            if(flag==true){
                list.add(trans[i]);
                i+=N;
            }
        }
        if(list.size()==0){
            System.out.print("Keep going...");
        }else{
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i));
                if(i!=list.size()-1){
                    System.out.println();
                }
            }
        }
    }
}
