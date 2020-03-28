package levelB;

import java.util.Scanner;

public class I009 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str[]=s.nextLine().split(" ");
        for(int i=str.length-1;i>=0;i--){
            System.out.print(str[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}
