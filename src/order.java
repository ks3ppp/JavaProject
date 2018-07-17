import java.io.FileInputStream;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class order {
	private static final order r = null;
	private int tableNum;
	private String[] orderMenu = {"ÇÜ¹ö°Å", "ÇÇÀÚ", "Ä¡Å²","°¨ÀÚÆ¢±è"};
	int price[] = {15,50,60,5}; 
	int Orderednum;
	int total =0;
	void getTotalPrice(int i) {
		total = total + price[i-1];
	System.out.println(total);
	}
	void getOrdernum(int p) {
		System.out.println(orderMenu[p-1]);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fi1 = new FileInputStream("c:/order/order.txt");
		int ch1;
		byte[] bt = new byte[1024];
		int i = 0;
		while ((ch1 = fi1.read())!= -1){
			bt[i] = (byte) ch1;  i++;
		}
		System.out.println(new String(bt));
		fi1.close();
		
	
	

		order a= new order();
//		a.menu();
//		foodmarket x = new foodmarket();
		
		Scanner sc = new Scanner(System.in);
		int x;
		while(true) {
			x = sc.nextInt();
			switch(x) {
			case 1 : 
				r.getTotalPrice(x);
				r.getOrdernum(x);
				break;
			case 2 : 
					r.getTotalPrice(x);
					r.getOrdernum(x);
					break;
			case 3 : 
			      r.getTotalPrice(x);
			      r.getOrdernum(x);
				break;
			case 4 : 
				r.getTotalPrice(x);
				r.getOrdernum(x);
				break;
			}
		}
	

	}
		
	}
	
	


