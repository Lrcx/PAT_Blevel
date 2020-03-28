package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I033 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;

        String first=br.readLine();
        if(first.contains(",")||first.contains(".")||first.contains("-")||first.contains("+"))
            flag=false;
        char[] badkey=first.toCharArray();
        char[] word=br.readLine().toCharArray();

        if(flag) {
            for(int i=0;i<badkey.length;i++) {
                for(int j=0;j<word.length;j++) {
                    if(word[j]==badkey[i]&&(word[j]>=48||word[j]<=57)) {
                        word[j]='%';
                    }else if((word[j]==badkey[i]||word[j]==badkey[j]+32)&&((word[j]>=65&&word[j]<=90)||(word[j]>=97&&word[j]<=122))){
                        word[j]='%';
                    }else if(word[j]=='_'&&word[j]==badkey[i]){
                        word[j]='%';
                    }
                }
            }
        }else {
            for(int i=0;i<badkey.length;i++) {
                for(int j=0;j<word.length;j++) {
                    if((word[j]>=48||word[j]<=57)&&word[j]==badkey[i]) {
                        word[j]='%';
                    }else if((word[j]>=97&&word[j]<=122)&&(word[j]==badkey[i]+32)) {
                        word[j]='%';
                    }else if(word[j]=='_'&&word[j]==badkey[i]){
                        word[j]='%';
                    }else if(word[j]>=65&&word[j]<=90) {
                        word[j]='%';
                    }
                }
            }
        }
        for(int i=0;i<word.length;i++) {
            if(word[i]!='%') {
                System.out.print(word[i]);
            }
        }
    }
}

