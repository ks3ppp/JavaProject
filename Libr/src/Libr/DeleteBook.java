package Libr;
import java.io.File;
import java.util.Scanner;
public class DeleteBook extends Program {
public static void deleteAllfiles(String path) {
  String input;
  File library = new File("c:\\tmp\\library");
  Scanner sc = new Scanner(System.in);
  input = sc.nextLine();
  File file = new File(path);
  File[] tempFile = file.listFiles();
  if(tempFile.length > 0){
    for(int i =0; i< tempFile.length; i++) {
      if(tempFile[i].isFile()) {
        tempFile[i].delete();
      }else{
        deleteAllfiles(tempFile[i].getPath());
      }
      tempFile[i].delete();
    }
    System.out.println("삭제할 책 ID를 입력하세요");
    if(library.exists()){
      if(library.delete())
        System.out.println("삭제가 완료되었습니다");
    }else{
      System.out.println("찾고자 하는 책이 없습니다");
    }
  }
}
}
  
  
