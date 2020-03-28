package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I067 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        String correct=str[0];
        int N=Integer.parseInt(str[1]);
        int count=0;
        while(true){
            String temp=br.readLine();
            if(temp.equals("#"))
                break;
            count++;
            if(temp.equals(correct)){
                System.out.println("Welcome in");
                break;
            }else
                System.out.println("Wrong password: "+temp);
            if(count>=N){
                System.out.println("Account locked");
                break;
            }
        }
    }
}
