package Libr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddBook extends Program {
public void add(){
		
		FileWriter id=null;			//입력할 책의 정보마다 텍스트를 생성
		FileWriter name=null;
		FileWriter author=null;
				
		
		try{
			
			System.out.println("추가할 책 id입력");
			input = scan.nextLine();
			
			String abpath = this.path+input+"\\";		//정보를 입력할 때마다 필요한 경로를 변수를 사용해서 간편하게 표시
			
			File book = new File(abpath); 				//파일명은 책의 code와 동일
			
			if(book.exists()){							//책이 이미있다면
				System.out.println("이미 등록되있는 책 입니다");	//출력
			}else{
				if(!book.mkdir())
					System.out.println("디렉터리 생성 실패");
			
				id = new FileWriter(abpath+"id.txt");
				id.write(input);
			
				
				System.out.println("책 이름 입력");			//책의 정보를 입력 받아 파일 이름은 카테고리, 내용은 텍스트 안에 쓴다
				input = scan.nextLine();

				name = new FileWriter(abpath+"name.txt");
				name.write(input);
			
				
				System.out.println("저자 입력");
				input = scan.nextLine();
			
				author = new FileWriter(abpath+"author.txt");
				author.write(input);
				
			
				
			id.close();
			name.close();
			author.close();
			
			
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
