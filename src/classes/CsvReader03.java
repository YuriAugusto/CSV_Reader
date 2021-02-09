package classes;

import java.io.FileReader;

public class CsvReader03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	}
	public static void readDataFromCustomSeparator(String file) {
		try {
			//objeto leitor de arquivo
			FileReader leitorArquivo = new FileReader(file);
			//objeto analisador e separador de colunas por ';'
			CSVParser analisador = new CSVParserBuilder().withSeparator(';').build();
			
			//objeto leitor de CSV com parâmetros, analisador e também leitor de arquivos
			CSVReader leitorCSV = CSVReaderBuilder(leitorArquivo).withCSVParser(analisador).build();
			
			//Array do tipo String que recebe os valores
			String[] proxValor;
			
			//lê arquivos linha a linha			
			while ((proxValor = leitorCSV.readNext()) !=null) {
				for(String celula : proxValor) {
					System.out.println(celula+"\t");
					
				}
				System.out.println();
			}
						
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	

}
