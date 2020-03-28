package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I039 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] tanzhu=br.readLine().toCharArray();
        char[] xiaohong=br.readLine().toCharArray();

        int[] count_tanzhu=new int[62];
        int[] count_hong=new int[62];

        //摊主
        for(int i=0;i<tanzhu.length;i++){
            if(tanzhu[i]>='0'&&tanzhu[i]<='9')
                count_tanzhu[tanzhu[i]-48]++;
            else if(tanzhu[i]>='A'&&tanzhu[i]<='Z')
                count_tanzhu[tanzhu[i]-55]++;
            else
                count_tanzhu[tanzhu[i]-61]++;
        }

        //小红
        for(int i=0;i<xiaohong.length;i++){
            if(xiaohong[i]>='0'&&xiaohong[i]<='9')
                count_hong[xiaohong[i]-48]++;
            else if(xiaohong[i]>='A'&&xiaohong[i]<='Z')
                count_hong[xiaohong[i]-55]++;
            else
                count_hong[xiaohong[i]-61]++;
        }

        boolean flag=true;
        int que=0;
        for(int i=0;i<62;i++){
            if(count_hong[i]!=0){
                //发现摊主的个数小于小红
                if(count_hong[i]>count_tanzhu[i]){
                    flag=false;
                    que+=count_hong[i]-count_tanzhu[i];
                }
            }
        }

        if(flag){
            System.out.print("Yes "+(tanzhu.length-xiaohong.length));
        }else
            System.out.print("No "+que);
    }
}
