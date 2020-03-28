package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I054 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        ArrayList<Double> list=new ArrayList<>();
        double sum=0;
        for(int i=0;i<str.length;i++){
            try{
                double temp=Double.parseDouble(str[i]);
                if(temp<-1000||temp>1000){
                    System.out.println("ERROR: "+str[i]+" is not a legal number");
                    continue;
                }
                double compare=Math.round(temp*100)*1.0/100;//Double.parseDouble(String.format("%.2f",temp))
                if(temp!=compare){
                    System.out.println("ERROR: "+str[i]+" is not a legal number");
                    continue;
                }
                sum+=temp;
                list.add(temp);
            }catch (Exception e){
                System.out.println("ERROR: "+str[i]+" is not a legal number");
            }
        }
        if(list.size()==0)
            System.out.println("The average of 0 numbers is Undefined");
        else if(list.size()==1)
            System.out.printf("The average of 1 number is %.2f",sum);
        else
            System.out.printf("The average of "+list.size()+" numbers is %.2f",sum/list.size());
    }
}
