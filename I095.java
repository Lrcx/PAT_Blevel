package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class I095 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);//考生人数
        int M=Integer.parseInt(str[1]);//统计要求的个数
        String[] student=new String[N];
        for(int i=0;i<N;i++)
            student[i]=br.readLine();
        for(int i=0;i<M;i++){
            str=br.readLine().split(" ");
            int type=Integer.parseInt(str[0]);
            switch(type){
                case 1:
                    ArrayList<String> id=new ArrayList<>();
                    ArrayList<Integer> score=new ArrayList<>();
                    for(int j=0;j<N;j++){
                        String[] temp=student[j].split(" ");
                        if(temp[0].charAt(0)==str[1].charAt(0)){
                            id.add(temp[0]);
                            score.add(Integer.parseInt(temp[1]));
                        }
                    }
                    System.out.println("Case "+(i+1)+": "+str[0]+" "+str[1]);
                    if(score.size()==0){
                        System.out.println("NA");
                        break;
                    }
                    Sort1[] sort1=new Sort1[score.size()];
                    for(int j=0;j<score.size();j++)
                        sort1[j]=new Sort1(id.get(j),score.get(j));
                    Arrays.sort(sort1);
                    for(int j=0;j<sort1.length;j++)
                        System.out.println(sort1[j].id+" "+sort1[j].score);
                    break;
                case 2:
                    int sum=0;
                    int count1=0;
                    for(int j=0;j<N;j++){
                        String[] temp=student[j].split(" ");
                        if(temp[0].substring(1,4).equals(str[1])){
                            sum+=Integer.parseInt(temp[1]);
                            count1++;
                        }
                    }
                    System.out.println("Case "+(i+1)+": "+str[0]+" "+str[1]);
                    if(count1==0){
                        System.out.println("NA");
                        break;
                    }
                    System.out.println(count1+" "+sum);
                    break;
                case 3:
                    int count2=0;
                    int num[]=new int[1000];
                    for(int j=0;j<N;j++){
                        String[] temp=student[j].split(" ");
                        if(temp[0].substring(4,10).equals(str[1])){
                            num[Integer.parseInt(temp[0].substring(1,4))]++;
                        }
                    }
                    for(int j=101;j<1000;j++)
                        if(num[j]!=0)
                            count2++;
                    System.out.println("Case "+(i+1)+": "+str[0]+" "+str[1]);
                    if(count2==0){
                        System.out.println("NA");
                        break;
                    }
                    Sort2[] sort2=new Sort2[count2];
                    int k=0;
                    for(int j=101;j<1000;j++){
                        if(num[j]!=0){
                            sort2[k]=new Sort2(j,num[j]);
                            k++;
                        }
                    }
                    Arrays.sort(sort2);
                    for(int j=0;j<count2;j++)
                        System.out.println(sort2[j].kaochang+" "+sort2[j].renshu);
                    break;
            }
        }
        br.close();
    }
}
class Sort1 implements Comparable<Sort1>{
    String id;
    int score;
    public Sort1(String id,int score){
        this.id=id;
        this.score=score;
    }
    @Override
    public int compareTo(Sort1 o) {
        if(o.score-this.score!=0)
            return o.score-this.score;
        else
            return this.id.compareTo(o.id);
    }
}

class Sort2 implements Comparable<Sort2>{
    int kaochang;
    int renshu;
    public Sort2(){}
    public Sort2(int kaochang,int renshu){
        this.kaochang=kaochang;
        this.renshu=renshu;
    }
    @Override
    public int compareTo(Sort2 o) {
        if(o.renshu-this.renshu!=0)
            return o.renshu-this.renshu;
        else
            return this.kaochang-o.kaochang;
    }
}
