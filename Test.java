package lowlevel;
import java.text.*;
import java.util.*;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.text.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Test{
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(2);
		list2.add(2);
		list2.add(3);
		for(int i=0;i<list2.size();i++) {
			int count=0;
			for(int j=0;j<list1.size();j++) {
				if(list2.get(i)==list1.get(j)) {
					count++;
				}
			}
			System.out.println(count+" ");
		}
		
//		String str=JOptionPane.showInputDialog("�����������ε������߳���");
//		String s[]=str.split(" ");	
//		int a=Integer.parseInt(s[0]);
//		int b=Integer.parseInt(s[1]);
//		int c=Integer.parseInt(s[2]);
//		if(a<=0||b<=0||c<=0) {
//			JOptionPane.showMessageDialog(null,"���ܹ���������" );
//		}else {
//			if(a+b<=c||a+c<=b||b+c<=a) {
//				JOptionPane.showMessageDialog(null,"���ܹ���������" );
//			}else {
//				if(a==b&&b==c) {
//					JOptionPane.showMessageDialog(null,"�ȱ�������" );
//				}else if(a==b||a==c||b==c){
//					JOptionPane.showMessageDialog(null,"����������" );
//				}else {
//					JOptionPane.showMessageDialog(null,"��ͨ������" );
//				}
//			}
//			
//		}
	}
}

