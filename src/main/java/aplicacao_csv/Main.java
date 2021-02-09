package aplicacao_csv;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import csvreader.CsvReader;
import dao_csv.CsvDAO;
import model_pessoas.CsvDados;

public class Main {
	public static void main(String[] args) {//control + shift + c comenta v�rias linhas		
		CsvDAO objCsvDAO = new CsvDAO();
		
		/*		
		Scanner teclado = new Scanner(System.in);	
		int id;
		String nome;
		int idade;
		String sexo;	
		*/
 		//--------------------------------------------------------------
		//chamo o m�todo e jogo na vari�vel lista
		
		//salva os dados a partir do CSV
		ArrayList<CsvDados> lista = CsvReader.lerDadosDoCsv("C:\\Users\\Yuri\\Documents\\Estudos\\C�digos\\Eclipse\\CSV\\10.csv");//quando o m�todo Main e o raiz s�o staticos o objeto n�o precisa ser instanciado
		objCsvDAO.salvar(lista);
		//----------------------
		
		
		
		
		objCsvDAO.exibir();;
	}
}


/*
   		//INSERIR DADOS (FUNCIONA)
		System.out.print("Digite o nome:");
		nome = teclado.next();
		System.out.print("Digite a idade:");
		idade = teclado.nextInt();	
		System.out.print("Digite o sexo [M/F]:");
		sexo = teclado.next();		
		objCsvDados.setNome(nome);
		objCsvDados.setIdade(idade);
		objCsvDados.setSexo(sexo);
		objCsvDAO.salvar(objCsvDados);
*/
/*		
  		//LER DADOS (FUNCIONA)		
		objCsvDAO.exibir();;
*/
/*
		//ATUALIZA DADOS (FUNCIONA)			
		System.out.print("Digite o id de quem quer atualizar dados:");
		id = teclado.nextInt();//aqui eu recebo o id
		objCsvDados.setId(id);
		
		System.out.print("Digite o novo nome:");
		nome = teclado.next();
		objCsvDados.setNome(nome);
		
		System.out.print("Digite a nova idade:");
		idade = teclado.nextInt();
		objCsvDados.setIdade(idade);
		
		System.out.print("Digite o sexo [M/F]:");
		sexo = teclado.next();
		objCsvDados.setSexo(sexo);
		objCsvDAO.atualizar(objCsvDados);	
*/
/*
		//REMOVE DADOS
		System.out.print("Digite o id que quer apagar:");
		id = teclado.nextInt();
		objCsvDados.setId(id);
		objCsvDAO.remover(objCsvDados);
*/

