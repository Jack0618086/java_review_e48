package tw.brad.e48;

import java.io.BufferedReader;
import java.io.FileReader;

public class Brad52 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/Fstdata.csv");
			BufferedReader br = new BufferedReader(reader);
			String line;
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		}catch(Exception e) {
			
		}
	}

}
