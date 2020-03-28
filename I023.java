package levelB;

import java.util.Scanner;

public class I023 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] count=new int[10];
        for(int i=0;i<10;i++){
            count[i]=s.nextInt();
        }
        if(count[0]>0){
            for(int i=1;i<10;i++){
                if(count[i]!=0){
                    System.out.print(i);
                    count[i]--;
                    break;
                }
            }
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<count[i];j++){
                System.out.print(i);
            }
        }
    }
}
