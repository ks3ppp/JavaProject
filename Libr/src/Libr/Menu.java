package Libr;

import java.io.File;
import java.util.Scanner;

public class Menu {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		File library = new File("c:\\tmp\\library");	//경로를 지정한다. c드라이브의 tmp라는 폴더에 지정
		
		if(!library.exists()){
			if(!library.mkdir())
				System.out.println("디렉터리 생성 실패");
		}
		
		for(;;){
			System.out.println("---------------");
			System.out.println("번호를 입력하세요");
			System.out.println("---------------");
			System.out.println("1. 도서추가");
			System.out.println("2. 도서삭제");
			System.out.println("3. 도서조회");
			System.out.println("4. 종료");
			System.out.println("---------------");
			
			int menu = sc.nextInt();	
			
			Menu book = new Menu();
			
			switch(menu){
				case 1:			
					AddBook Abook = new AddBook();
					Abook.add();	
					break;
				case 2:
					DeleteBook Dbook = new DeleteBook();
					break;
				case 3:
					CheckBook Cbook = new CheckBook();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("1~4까지의 메뉴를 선택해 주십시오");
			}
			
			if(menu==4)
				break;
		}

	}

}
