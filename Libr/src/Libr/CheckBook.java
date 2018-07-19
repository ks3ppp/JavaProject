package Libr;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckBook extends Program {
	public void check(){
		File library = new File("c:\\tmp\\library");
		File[] booklist = library.listFiles();
		
		FileReader IFRead = null;
	
		
		try{
		
			for(int i=0; i<booklist.length; i++){
				File[] bookIF = booklist[i].listFiles();
				File[] IFtemp = booklist[i].listFiles(); //파일들의 순서를 바꾸기 위해 생성
				String[] filename = booklist[i].list();  //파일들의 이름은 모든 책이 다 똑같기 때문에 내용보다 이름으로 순서를 정한다
				String[] nameprint = {"도서번호", "제목", "저자"};
				
				
				
				for(int j=0; j<bookIF.length; j++){ 		 //id, name, author순서대로 나오기 위한 작업
					if(filename[j].equals("id.txt")){
						bookIF[0]=IFtemp[j];
					}else if(filename[j].equals("name.txt")){
						bookIF[1]=IFtemp[j];
					}else if(filename[j].equals("author.txt")){						
						bookIF[2]=IFtemp[j];
					}
					
				} 
				
				System.out.print("책 (");	
				
				for(int j=0; j<bookIF.length; j++){
					IFRead = new FileReader(bookIF[j]);
					
					System.out.printf(nameprint[j]+"=");
				
					int c;
					while ((c = IFRead.read())!= -1){
						System.out.print((char)c);;
					}	
					
					if(!(j+1==bookIF.length))		 //다음에 출력할 항목이 있는지 확인
						System.out.print(", ");		//없는 경우에는 ', '을 출력하지 않는다
					
					IFRead.close();					
				}
				System.out.printf(")\n");
			}	
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
