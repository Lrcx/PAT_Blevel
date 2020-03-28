package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class I085{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str;
        HashMap<String,Double> score=new HashMap<>();
        HashMap<String ,Integer> count=new HashMap<>();
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            String name=str[2].toLowerCase();
            if(score.containsKey(name)){
                switch (str[0].charAt(0)){
                    case 'A':score.put(name,score.get(name)+Double.parseDouble(str[1]));break;
                    case 'B':score.put(name,score.get(name)+Double.parseDouble(str[1])/1.5);break;
                    case 'T':score.put(name,score.get(name)+Double.parseDouble(str[1])*1.5);break;
                }
                count.put(name,count.get(name)+1);
            }else{
                switch (str[0].charAt(0)){
                    case 'A':score.put(name,Double.parseDouble(str[1]));break;
                    case 'B':score.put(name,Double.parseDouble(str[1])/1.5);break;
                    case 'T':score.put(name,Double.parseDouble(str[1])*1.5);break;
                }
                count.put(name,1);
            }
        }
        Object[] schName=score.keySet().toArray();
        Object[] schScore=score.values().toArray();
        Object[] schCount=count.values().toArray();
        int length=schName.length;
        School sch[]=new School[length];
        for(int i=0;i<length;i++)
            sch[i]=new School((String)schName[i],(int)(double)schScore[i],(int)schCount[i]);
        Arrays.sort(sch);
        int[] rank=new int[length];
        for(int i=0;i<length;i++)
            rank[i]=i+1;
        for(int i=1;i<length;i++){
            if(sch[i].schScore==sch[i-1].schScore)
                rank[i]=rank[i-1];
        }
        System.out.println(length);
        for(int i=0;i<length;i++)
            System.out.println(rank[i]+" "+sch[i].schName+" "+sch[i].schScore+" "+sch[i].schCount);
    }
}
class School implements Comparable<School>{
    String schName;
    int schScore;
    int schCount;
    public School(String schName,int schScore,int schCount){
        this.schName=schName;
        this.schScore=schScore;
        this.schCount=schCount;
    }
    @Override
    public int compareTo(School o) {
        if(o.schScore-this.schScore!=0)
            return o.schScore-this.schScore;
        else if(this.schCount-o.schCount!=0)
            return this.schCount-o.schCount;
        else
            return this.schName.compareTo(o.schName);
    }
}