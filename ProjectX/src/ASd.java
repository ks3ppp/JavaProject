import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ASd {

	
		
		void load() throws IOException {
			String filePath = "c:/test/order.txt";
			
			
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String [] lineContents;
			String line = null;
			while((line = br.readLine()) !=null) {
				lineContents = line.split(",");
				System.out.println(lineContents[1]);
			}
			br.close();
			fr.close();
				
		}

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			ASd o = new ASd();
			o.load();
		}
}
