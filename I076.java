package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I076 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str=br.readLine();
            if(str.contains("A-T"))
                System.out.print("1");
            else if(str.contains("B-T"))
                System.out.print("2");
            else if(str.contains("C-T"))
                System.out.print("3");
            else if(str.contains("D-T"))
                System.out.print("4");
        }
    }
}
