package aplicacao_csv;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import csvreader.CsvReader;
import dao_csv.CsvDAO;
import model_pessoas.CsvDados;

public class Main {
	public static void main(String[] args) {//control + shift + c comenta várias linhas		
		CsvDAO objCsvDAO = new CsvDAO();
		CsvDados objCsvDados = new CsvDados();
		Scanner teclado = new Scanner(System.in);	
		int id;
		String nome;
		int idade;
		String sexo;
		//----------------------
		
		String genero;
		
		objCsvDAO.exibir();
		System.out.print("Digite o id que quer apagar:");
		id = teclado.nextInt();		
		objCsvDAO.remover(id);		
		objCsvDAO.exibir();
	}
}

/*
 		//INSERIR DADOS A PARTIR DO CSV
		//ArrayList<CsvDados> lista = CsvReader.lerDadosDoCsv("C:\\Users\\Yuri\\Documents\\Estudos\\Códigos\\Eclipse\\AluraProjects\\CSV_Refatorado\\resoucers\\CSV\\10.csv");//quando o método Main e o raiz são staticos o objeto não precisa ser instanciado
		//objCsvDAO.salvar(lista);
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
		objCsvDAO.exibir();
		System.out.print("Digite o id que quer apagar:");
		id = teclado.nextInt();		
		objCsvDAO.remover(id);		
		objCsvDAO.exibir();
*/

