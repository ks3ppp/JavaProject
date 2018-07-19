package cecom;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.sql.*;
public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		// File location 
		 		String path = new File("src").getAbsolutePath(); 
		 	     
		 		String fileName = path + "/order.xlsx"; 
		 		 
		 		// Order class lists  
		 		List<Order> orderList = new ArrayList<>(); 
		 
		
		 		// Initial needed values 
		 		XSSFWorkbook inputWorkbook = null; 
		 		XSSFRow incurRow; 
		 		XSSFCell incurCell; 
		 		XSSFSheet incurSheet; 
		 
		 
		 		int rowCount = 0; 
		 
		 
		 		// Open file & get file data 
		 		FileInputStream fis = new FileInputStream(fileName); 
		 		inputWorkbook = new XSSFWorkbook(fis); 
		 		fis.close(); 
		 
		 
		 		// Process sheet data 
		 
		 
		 		// Get 1ST sheet 
		 		incurSheet = inputWorkbook.getSheetAt(0); 
		 
		 
		 		// Get 1ST sheet number of rows 
		 		rowCount = incurSheet.getPhysicalNumberOfRows(); 
		 
		
		 		for (int rowIndex = 1; rowIndex < rowCount; rowIndex++) { 
		 			// Get row 
		 			incurRow = incurSheet.getRow(rowIndex); 
		 
		
		 			String invalue[] = new String[4]; 
		 
		
		 			int cellCount = incurRow.getPhysicalNumberOfCells(); 
		 			for (int cellIndex = 0; cellIndex < cellCount; cellIndex++) { 
		 				// Get every cell data 
		 				incurCell = incurRow.getCell(cellIndex); 
		 
				 				switch (incurCell.getCellTypeEnum()) { 
		 
		
		 				case STRING: 
		 					invalue[cellIndex] = incurCell.getStringCellValue() + ""; 
		 					break; 
		 
		
		 				case NUMERIC: 
		 					invalue[cellIndex] = incurCell.getNumericCellValue() + ""; 
		 					break; 
		 
		 
		 				default: 
		 					System.out.println(incurCell.getCellTypeEnum()); 
		 				} 
		 			} 
		 			
		 			
		 			Connection conn;
		 			Statement stmt = null;

		 			try {
		 				Class.forName("com.mysql.jdbc.Driver");
		 				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?useSSL=false&serverTimezone=Asia/Seoul", "root","ch03080928");
		 				System.out.println("DB 연결완료");
		 				stmt = conn.createStatement();
		 				stmt.executeUpdate("insert into orderMenu(tablenumber, ordermenu) values("+(int) Float.parseFloat(invalue[0])+",'"+invalue[1]+");");
		 			}catch (ClassNotFoundException e) {
		 				System.out.println("JDBC 드라이버 로드 에러");
		 			}catch (SQLException e) {
		 				System.out.println("DB 연결 오류"+e.getMessage());
		 			}
		 
		 			Order order = new Order(); 
		 			order.setTableNumber((int) Float.parseFloat(invalue[0])); 
		 			order.setOrderedMenu(invalue[1]); 
//		 			order.setMenuPrice((int) Float.parseFloat(invalue[2].substring(0, invalue[2].length() - 1))); 
//		 			order.setOrderedNumber((int) Float.parseFloat(invalue[3])); 
		 			 
		 			orderList.add(order); 
		 		} 
	 
		 
		 		inputWorkbook.close(); 
		 		 
		 		for (Order order : orderList) { 
		 			System.out.println(order.toString()); 
		 		} 
		 	} 
		 } 

		
		
		
		
		 		
		
	


