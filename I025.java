package lowlevel;

import java.util.*;
//��������������Ч�������Ҫ���ȿ���һ��
public class I025 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();//���ڶ�λ������ӽ�ȥ
		ArrayList list1=new ArrayList();
		String lin1=s.nextLine();//ͳ�Ƶ�һ�е�����
		String[] lin1_sep=lin1.split(" ");//�Ե�һ�������Կո���в��
		String input[]=new String[Integer.parseInt(lin1_sep[1])];//ͳ�����������
//		String[] input_sep=new String[];
		int count=0;//ͳ����������ݵ�һ�����±�
		for(int i=0;i<Integer.parseInt(lin1_sep[1]);i++) {
			input[i]=s.nextLine();
			String[] input_sep=input[i].split(" ");//�������ݵĲ������
			if(lin1_sep[0].equals(input_sep[0])) {
				count=i;
			}
		}	
		list.add(input[count].split(" ")[1]);
		for(int i=0;i<Integer.parseInt(lin1_sep[1]);i++) {
			for(int j=0;j<Integer.parseInt(lin1_sep[1]);j++) {
				if(input[count].split(" ")[2].equals(input[j].split(" ")[0])) {
					list.add(input[j].split(" ")[1]);
					count=j;
					break;
				}
			}
		}
		for(int i=0;i<Integer.parseInt(lin1_sep[1]);i++){
			for(int j=0;j<Integer.parseInt(lin1_sep[1]);j++) {
				if(list.get(i).equals(input[j].split(" ")[1])) {
//					System.out.println(input[j]);
					list1.add(input[j]);
					break;
				}
			}
		}
		int total=Integer.parseInt(lin1_sep[1])/Integer.parseInt(lin1_sep[2]);
		int sheng=Integer.parseInt(lin1_sep[1])%Integer.parseInt(lin1_sep[2]);
		int count1=0;
		while(count1<total) {
			for(int i=Integer.parseInt(lin1_sep[2])-1;i>=0;i--){
				if(i==0) {
					System.out.println(String.valueOf(list1.get(0)).split(" ")[0]+" "+
							String.valueOf(list1.get(0)).split(" ")[1]+" "+
							String.valueOf(list1.get(Integer.parseInt(lin1_sep[2])-1)).split(" ")[2]);
				}else {
//					System.out.println(String.valueOf(list1.get(i)).split(" ")[0]+" "+
//							String.valueOf(list1.get(i)).split(" ")[1]+" "+
//							String.valueOf(list1.get(i-1)).split(" ")[0]);
					System.out.println(((String) list1.get(i)).split(" ")[0]+" "+
							((String) list1.get(i)).split(" ")[1]+" "+
							((String) list1.get(i-1)).split(" ")[0]);
				}
			}
			count1++;
			for(int i=Integer.parseInt(lin1_sep[2])-1;i>=0;i--) {
				list1.remove(i);
			}
		}
		for(int i=0;i<sheng;i++) {
			System.out.println(list1.get(i));
		}
	}	
}
