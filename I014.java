package levelB;

import java.util.Scanner;

public class I014 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[] line1=s.nextLine().toCharArray();
        char[] line2=s.nextLine().toCharArray();
        char[] line3=s.nextLine().toCharArray();
        char[] line4=s.nextLine().toCharArray();

        boolean flag=true;
        for(int i=0;i<line1.length;i++){
            if(flag){
                if(line1[i]==line2[i]&&line1[i]>='A'&&line1[i]<='G'){
                    flag=false;
                    switch (line1[i]){
                        case 'A':System.out.print("MON ");break;
                        case 'B':System.out.print("TUE ");break;
                        case 'C':System.out.print("WED ");break;
                        case 'D':System.out.print("THU ");break;
                        case 'E':System.out.print("FRI ");break;
                        case 'F':System.out.print("SAT ");break;
                        case 'G':System.out.print("SUN ");break;
                    }
                }
            }else{
                if(line1[i]==line2[i]&&((line1[i]>='0'&&line1[i]<='9')||(line1[i]>='A'&&line1[i]<='N'))){
                    switch (line1[i]){
                        case '0':System.out.print("00:");break;
                        case '1':System.out.print("01:");break;
                        case '2':System.out.print("02:");break;
                        case '3':System.out.print("03:");break;
                        case '4':System.out.print("04:");break;
                        case '5':System.out.print("05:");break;
                        case '6':System.out.print("06:");break;
                        case '7':System.out.print("07:");break;
                        case '8':System.out.print("08:");break;
                        case '9':System.out.print("09:");break;
                        case 'A':System.out.print("10:");break;
                        case 'B':System.out.print("11:");break;
                        case 'C':System.out.print("12:");break;
                        case 'D':System.out.print("13:");break;
                        case 'E':System.out.print("14:");break;
                        case 'F':System.out.print("15:");break;
                        case 'G':System.out.print("16:");break;
                        case 'H':System.out.print("17:");break;
                        case 'I':System.out.print("18:");break;
                        case 'J':System.out.print("19:");break;
                        case 'K':System.out.print("20:");break;
                        case 'L':System.out.print("21:");break;
                        case 'M':System.out.print("22:");break;
                        case 'N':System.out.print("23:");break;
                    }
                    break;
                }
            }
        }
        for(int i=0;i<line3.length;i++){
            if(line3[i]==line4[i]&&((line3[i]>='A'&&line3[i]<='Z')||(line3[i]>='a'&&line3[i]<='z'))){
                if(i<10){
                    System.out.print("0"+i);
                }else{
                    System.out.print(i);
                }
                break;
            }
        }
    }
}
