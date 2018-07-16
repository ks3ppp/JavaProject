
import java.util.Scanner;

public class 가위바위보{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


 Scanner scan = new Scanner(System.in);
 String nameOne = "별이", nameTwo ="꼬마", varOne, varTwo; 
 int pandanOne = 0;  
 int pandanTwo = 0; 

 String win = "승리!", lose = "패배ㅜ", draw = "무승부!", pandan = "";


while (true) {
	System.out.println("가위, 바위, 보 게임시작!");
	System.out.println("=========================");
	
	System.out.print(nameOne + ":");
	varOne = scan.next();
	System.out.print(nameTwo + ":");
	varTwo = scan.next();
	
	if(varOne.equals("가위")) {
		pandanOne = 1;
	}else if (varOne.equals("바위")) {
	}else if (varOne.equals("보")) {
		pandanOne = 3;
	}
	if(varTwo.equals("가위")) {
		pandanTwo=1;
	}else if(varTwo.equals("바위")) {
		pandanTwo=2;
	}else if(varTwo.equals("보")){
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
		
		System.out.println("계속하시겠습니까?\n종료하시겠습니까?");
		System.out.print("입력");
		pandan = scan.next();
		if(pandan.equals("계속")) {
		}else {
			break;
		}
	}
	
	
			
	}
	
  }
 }
