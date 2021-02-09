package csvreader;

import java.io.FileReader;
//import java.util.List;
import java.util.List;
import java.util.ArrayList;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import model_pessoas.CsvDados;

public class CsvReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lerDadosDoCsv("C:\\Users\\Yuri\\Documents\\Estudos\\Códigos\\Eclipse\\CSV\\10.csv");//
		
		CsvDados objCsvDados = new CsvDados();
			
	}
	public static ArrayList<CsvDados> lerDadosDoCsv(String file) {// control + shift + o importa todas as libraries de uma vez // control + espaço faz auto complete
		
		ArrayList<CsvDados> lista = new ArrayList<CsvDados>();//Csv dados é a referencia da classe, isso pq o conteúdo vai ser o CsvDados
		
		
		try {
			
			//objeto leitor de arquivo
			FileReader leitorArquivo = new FileReader(file);
			
			//objeto analisador e separador de colunas por ';'
			CSVParser analisador = new CSVParserBuilder().withSeparator(';').build();
			
			//objeto leitor de CSV com parâmetros, analisador e também leitor de arquivos
			CSVReader leitorCSV = new CSVReaderBuilder(leitorArquivo).withCSVParser(analisador).build(); 

			
			//Array do tipo String que recebe os valores
			List<String[]> proxValor = leitorCSV.readAll();
			//String[] proxValor;			
					
			//lê arquivos linha a linha	
			boolean isPrimeiraLinha = true;//variável para pular linha
			
			for (String[] linha : proxValor) { //a linha pega cada linha da tabela
				if(isPrimeiraLinha ) {//ele pula a primeira linha
					isPrimeiraLinha = false;
					continue;//ele pula a iteração
				}
				CsvDados conteudoLinha = new CsvDados();
				conteudoLinha.setNome(linha[0]);
				conteudoLinha.setIdade(Integer.parseInt(linha[1]));//converti de String para int
				conteudoLinha.setSexo(linha[2]);	
				lista.add(conteudoLinha);//os valores de conteudoLinha foram adicionados na lista "lista"
				
			}			
			
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		return lista;//nome do ArrayList
	}
	

}
