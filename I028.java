package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I028 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String name,date,maxname="",minname="",maxdate="1814/09/06",mindate="2014/09/06",str[];
        int count=0;
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            name=str[0];date=str[1];
            if(date.compareTo("2014/09/06")<=0&&date.compareTo("1814/09/06")>=0){
                count++;
                if(maxdate.compareTo(date)<0){
                    maxdate=date;
                    maxname=name;
                }
                if(mindate.compareTo(date)>0){
                    mindate=date;
                    minname=name;
                }

            }
        }
        System.out.print(count);
        if(count!=0){
            System.out.printf(" "+minname+" "+maxname);
        }
    }
}
