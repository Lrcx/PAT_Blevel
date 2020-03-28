package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I037 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        br.close();
        String[] temp=str[0].split("\\.");
        long P=Integer.parseInt(temp[0])*17*29+Integer.parseInt(temp[1])*29+Integer.parseInt(temp[2]);
        temp=str[1].split("\\.");
        long A=Integer.parseInt(temp[0])*17*29+Integer.parseInt(temp[1])*29+Integer.parseInt(temp[2]);

        long cha=A-P;
        if(cha<0){
            System.out.print("-");
            cha=-cha;
        }

        long Galleon,Sickle,Knut;
        Galleon=cha/29/17;
        Sickle=(cha-Galleon*29*17)/29;
        Knut=cha-Galleon*29*17-Sickle*29;

        System.out.print(Galleon+"."+Sickle+"."+Knut);
    }
}
