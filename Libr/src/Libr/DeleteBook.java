package Libr;
import java.io.File;
import java.util.Scanner;
public class DeleteBook extends Program {
  
  public void delete(){
    Scanner sc = new Scanner(System.in);
    File library = new File("c:\\tmp\\libarary");
    System.out.println("삭제할 책 ID를 입력하세요");
    input = scann.nextLine();
    if(library.exists()){
      if(library.delete())
        System.out.println("삭제가 완료되었습니다");
    }else{
      System.out.println("찾고자 하는 책이 없습니다");
}
  }
}
  
