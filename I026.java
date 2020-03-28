package levelB;

import java.util.Scanner;

public class I026 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int c1=s.nextInt();
        int c2=s.nextInt();
        double c=Math.round((c2-c1)*1.0/100);
        int hour=(int)c/3600;
        int minute=(int)c%3600/60;
        int second=(int)c%3600%60;
        System.out.printf("%02d:%02d:%02d",hour,minute,second);
    }
}

