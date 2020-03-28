package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class I080 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int P=Integer.parseInt(temp[0]);//做了在线编程作业的学生数
        int M=Integer.parseInt(temp[1]);//参加了其中考试的学生数
        int N=Integer.parseInt(temp[2]);//参加了期末考试的学生数
        String[] str;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<P;i++){
            str=br.readLine().split(" ");
            if(Integer.parseInt(str[1])>=200)
                map.put(str[0],Integer.parseInt(str[1]));
        }
        Object[] name=map.keySet().toArray();
        int length=name.length;
        Object[] program=map.values().toArray();
        for(int i=0;i<length;i++){
            map.put((String)name[i],0);
        }
        for(int i=0;i<M;i++){
            str=br.readLine().split(" ");
            if(map.containsKey(str[0]))
                map.put(str[0],Integer.parseInt(str[1]));
        }
        Object[] midScore=map.values().toArray();
        for(int i=0;i<length;i++){
            map.put((String)name[i],0);
        }
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            if(map.containsKey(str[0]))
                map.put(str[0],Integer.parseInt(str[1]));
        }
        Object[] finalScore=map.values().toArray();
        Student[] stu=new Student[length];
        for(int i=0;i<length;i++){
            int a=(int)finalScore[i];
            int b=(int)midScore[i];
            if(a<b){
                stu[i]=new Student((String)name[i],(int)program[i],b,a,(int)Math.round(a*0.6+b*0.4));
            }else
                stu[i]=new Student((String)name[i],(int)program[i],b,a,a);
        }
        Arrays.sort(stu);
        for(int i=0;i<length;i++){
            if(stu[i].G>=60)
                if(stu[i].midScore==0){
                    System.out.println(stu[i].name+" "+stu[i].program+" -1 "+stu[i].finalScore+" "+stu[i].G);
                }else
                    System.out.println(stu[i].name+" "+stu[i].program+" "+stu[i].midScore+" "+stu[i].finalScore+" "+stu[i].G);
        }
    }
}
class Student implements Comparable<Student>{
    String name;
    int program;
    int midScore;
    int finalScore;
    int G;
    public Student(String name,int program,int midScore,int finalScore,int G){
        this.name=name;
        this.program=program;
        this.midScore=midScore;
        this.finalScore=finalScore;
        this.G=G;
    }
    @Override
    public int compareTo(Student o){
        if(this.G<o.G)
            return 1;
        else if(this.G>o.G)
            return -1;
        else
            return this.name.compareTo(o.name);
    }
}