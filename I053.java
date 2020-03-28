package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class I053 {
    public static void main(String[] args) throws Exception{
        I053 pat=new I053();
        DecimalFormat df=new DecimalFormat("0.0");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String observe[]=bf.readLine().split(" ");   //总套数  低电量阈值  观察阈值
        int N=Integer.parseInt(observe[0]);
        double e=Double.parseDouble(observe[1]);
        int D=Integer.parseInt(observe[2]);
        String house[]=new String[N];
        for(int i=0;i<house.length;i++){
            house[i]=bf.readLine();
        }
        bf.close();
        int pos=0;  //可能空置的数量
        int must=0;  //一定空置的数量
        for(int i=0;i<house.length;i++){
            int fit=0;
            double elec[]=pat.split(house[i]);
            for(int j=1;j<elec.length;j++){
                if(elec[j]<e){
                    fit++;
                }
            }
            if(fit<=elec[0]/2){
                continue;
            }
            else{
                if(elec[0]>D){
                    must++;
                }else{
                    pos++;
                }
            }
        }
        // double b=must*100.0/N;
        // double a=pos*100.0/N;
        double b=(double)Math.round(must*10.0*100/N)/10;
        double a=(double)Math.round(pos*10.0*100/N)/10;
        System.out.println(df.format(a)+"%"+" "+df.format(b)+"%");
    }
    public static double[] split(String string){
        String str[]=string.split(" ");
        double m[]=new double[str.length];
        for(int i=0;i<m.length;i++){
            m[i]=Double.parseDouble(str[i]);
        }
        return m;
    }
}
