package levelB;

import java.util.Scanner;

public class I019 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int length=str.length();
        if(length<4){
            for(int i=0;i<4-length;i++){
                str+=0;
            }
        }
        char[] N=str.toCharArray();

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int cha=0;
        while(cha!=6174){
            for(int i=0;i<N.length-1;i++){
                for(int j=i;j<N.length;j++){
                    if(N[i]<N[j]){
                        char c=N[i];
                        N[i]=N[j];
                        N[j]=c;
                    }
                }
            }
            for(int i=0;i<N.length;i++){
                sb1.append(N[i]);
            }
            for(int i=N.length-1;i>=0;i--){
                sb2.append(N[i]);
            }
            cha=Integer.parseInt(String.valueOf(sb1))-Integer.parseInt(String.valueOf(sb2));
            if(cha==0){
                System.out.print(sb1+" - "+sb2+" = "+"0000");
                return;
            }
            String temp;
            if(String.valueOf(cha).length()<4){
                temp="0"+cha;
            }else{
                temp=String.valueOf(cha);
            }
            N=temp.toCharArray();
            System.out.println(sb1+" - "+sb2+" = "+temp);

            sb1.delete(0,sb1.length());
            sb2.delete(0,sb2.length());
        }
    }
}
