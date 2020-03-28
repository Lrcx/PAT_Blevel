package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I029 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[] c1=s.next().toCharArray();
        char[] c2=s.next().toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<c1.length;i++){
            boolean flag=true;
            for(int j=0;j<c2.length;j++){
                if(c1[i]==c2[j]){
                    flag=false;
                    break;
                }
            }
            if(flag)
                list.add(c1[i]);
        }
        char[] badkey=new char[list.size()];
        for(int i=0;i<badkey.length;i++){
            badkey[i]=Character.toUpperCase(list.get(i));
        }
        for(int i=badkey.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(badkey[i]==badkey[j])
                    badkey[i]='*';
            }
        }
        for(int i=0;i<badkey.length;i++){
            if(badkey[i]!='*'){
                System.out.print(badkey[i]);
            }
        }
    }
}
