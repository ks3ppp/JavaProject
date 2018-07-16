import java.io.FileInputStream;


public class order2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		FileInputStream fi1 = new FileInputStream("c:/order/order.xlsx");
		int ch1;
		byte[] bt = new byte[1024];
		int i = 0;
		while ((ch1 = fi1.read())!= -1){
			bt[i] = (byte) ch1;  i++;
		}
		System.out.println(new String(bt));
		fi1.close();
	
	}

}
