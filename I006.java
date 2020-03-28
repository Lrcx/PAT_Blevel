package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I006 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        ArrayList<String> list=new ArrayList<>();
        int count=0;
        while(N!=0){
            String str="";
            int num=N%10;
            count++;
            switch (count){
                case 1:
                    for(int i=1;i<=num;i++){
                        str+=i;
                    }
                    list.add(str);
                    break;
                case 2:
                    for(int i=0;i<num;i++){
                        str+='S';
                    }
                    list.add(str);
                    break;
                case 3:
                    for(int i=0;i<num;i++){
                        str+='B';
                    }
                    list.add(str);
                    break;
            }
            N=N/10;
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }
}
