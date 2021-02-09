package classes;

public class CsvReader02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void readDataLineByLine(Strings file) {
		
		try {
			//leitor de arquivo == leitorFile
			FileReader leitorFile = new FileReader(file);
			
			//leitor de CSV == leitorCSV
			CSVReader leitorCSV = new CSVReader(leitorFile);
			
			//vetor com tamanho máximo indeterminado, tipo String
			Strings[] proxRegistro;
		
			//vamos ler dados linha por linha
			//enquanto ouvere registros o for será executado
			while((proxRegistro = leitorCSV.readNext()) !=null) {
				//for each String linha
				for(String linha: proxRegistro) {					
					System.out.println(linha+"\t");					
				}
				System.out.println();	
			}
			
		}
		cath(Exeption e){
			e.printStackTrace();
			
		}
		
	}

}
