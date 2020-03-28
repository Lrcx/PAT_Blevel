package levelB;

import java.util.Scanner;

public class I021 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c[]=s.next().toCharArray();
        int[] count={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<c.length;i++){
            count[c[i]-48]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.println(i+":"+count[i]);
            }
        }
    }
}
