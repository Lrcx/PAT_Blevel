package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I044 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=new String[N];
        for(int i=0;i<N;i++)
            str[i]=br.readLine();

        String[] low={"tret","jan","feb","mar","apr","may","jun","jly","aug","sep","oct","nov","dec"};
        String[] high={"tret","tam","hel","maa","huh","tou","kes","hei","elo","syy","lok","mer","jou"};

        for(int i=0;i<N;i++){
            try {
                int num=Integer.parseInt(str[i]);
                int a=num/13;
                int b=num%13;
                if(a==0)
                    System.out.println(low[b]);
                else
                if(b==0)
                    System.out.println(high[a]);
                else
                    System.out.println(high[a]+" "+low[b]);
            }catch (Exception e){
                String[] temp=str[i].split(" ");
                if(temp.length==2){
                    int index1=0,index2=0;
                    for(int j=0;j<13;j++){
                        if(temp[0].equals(high[j]))
                            index1=j;
                        if(temp[1].equals(low[j]))
                            index2=j;
                    }
                    System.out.println(index1*13+index2);
                }else{
                    for(int j=0;j<13;j++){
                        if(temp[0].equals(low[j])){
                            System.out.println(j);
                            break;
                        }
                        if(str[i].equals(high[j])){
                            System.out.println(13*j);
                            break;
                        }
                    }

                }
            }
        }
    }
}
