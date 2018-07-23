package Libr;

import java.io.File;
import java.util.Scanner;

public clas DeleteBook extends Program{
  pubic void delete(){
    System.out.println("삭제할 책의 id를 입력하세요");
    input = scan.nextLine();
    File fd = new File(this.path+input);
    
    if(!fd.exists())
      System.out.println("없는 책 입니다");
    else
      File[] innerFiles = fd.listFiles();     //하위 폴더를 리스트해서 객체 생성
    for(int i =0; i<innerfiles.length; i++){  //하위 폴더가 존재하는 경우 상위 폴더가 삭제 불가능 하기 때문에 하위폴더들을 먼저 지워준다
      innerfiles[i].delete();
    }
    fd.delete();
    System.out.println("책이 삭제 되었습니다"); //책 삭제
  }
}
}






















  
  
