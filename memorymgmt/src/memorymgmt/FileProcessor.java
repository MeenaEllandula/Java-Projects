package memorymgmt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileProcessor {

	
	FileReader fileReader;
	BufferedReader bufferedReader;

	public FileProcessor(String fileName) {
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void processData() {
		
		try {
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			fileReader.close();
			
			bufferedReader.close();
			
		} catch (Exception e) {

		e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		try {
            fileReader.close();
			bufferedReader.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
