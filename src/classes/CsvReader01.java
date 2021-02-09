package classes;

import java.io.FileWriter;
import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class CsvReader01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> rows = Arrays.asList(				
		Arrays.asList("Jhonny","author","Hi im Bolivinha"),
		Arrays.asList("Yuri","author","Brincone"),
		Arrays.asList("Thameus","editor","Morpheus")
		);
		
		FileWriter csvLeitor = new FileWriter("new.csv");
		csvLeitor.append("Name");
		csvLeitor.append(";");
		csvLeitor.append("Role");
		csvLeitor.append(";");
		csvLeitor.append("Nick");
		csvLeitor.append("\n");
		
		for(List<String> rowData : rows) {//List<String>??, rowData == nome da variável, rows == array
			csvLeitor.append(String.join(";", rowData));
			csvLeitor.append("\n");		
		}
		
		csvLeitor.flush();
		csvLeitor.close();
		
	}

}
