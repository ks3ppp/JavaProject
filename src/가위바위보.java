
import java.util.Scanner;

public class ����������{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


 Scanner scan = new Scanner(System.in);
 String nameOne = "����", nameTwo ="����", varOne, varTwo; 
 int pandanOne = 0;  
 int pandanTwo = 0; 

 String win = "�¸�!", lose = "�й��", draw = "���º�!", pandan = "";


while (true) {
	System.out.println("����, ����, �� ���ӽ���!");
	System.out.println("=========================");
	
	System.out.print(nameOne + ":");
	varOne = scan.next();
	System.out.print(nameTwo + ":");
	varTwo = scan.next();
	
	if(varOne.equals("����")) {
		pandanOne = 1;
	}else if (varOne.equals("����")) {
	}else if (varOne.equals("��")) {
		pandanOne = 3;
	}
	if(varTwo.equals("����")) {
		pandanTwo=1;
	}else if(varTwo.equals("����")) {
		pandanTwo=2;
	}else if(varTwo.equals("��")){
		pandanTwo=3;
	}
	if(pandanOne ==1&& pandanTwo ==1 || pandanOne ==2 
			&& pandanTwo ==2 || pandanOne==3&& pandanTwo ==3) {
		System.out.println(nameOne + " "+nameTwo+" "+ draw);
	}
	else if (pandanOne==1&&pandanTwo ==3 || pandanOne ==2
			&& pandanTwo ==1 || pandanOne ==3&& pandanTwo ==2) {
		System.out.println(nameOne + win+ "/"+nameTwo + lose);
	}
	else if (pandanOne ==1 && pandanTwo ==2 || pandanOne ==2
			&&pandanTwo==3||pandanOne==3&&pandanTwo==1) {
		System.out.println(nameOne +lose+"/"+nameTwo + win);
		
		System.out.println("����Ͻðڽ��ϱ�?\n�����Ͻðڽ��ϱ�?");
		System.out.print("�Է�");
		pandan = scan.next();
		if(pandan.equals("���")) {
		}else {
			break;
		}
	}
	
	
			
	}
	
  }
 }
