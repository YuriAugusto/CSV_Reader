package dao_csv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import connection.ConnectionFactory;
import model_pessoas.CsvDados;

public class CsvDAO {
	//SALVAR
	public void salvar(ArrayList<CsvDados> salvarDados) {//ArrayList<CsvDados> é o array e salvarDados é o parâmetro
	String sql = "INSERT INTO pessoas(nome, idade, sexo) VALUES (?, ?, ?)";	
	Connection conn = null;
	PreparedStatement pstm = null;	
		try {
			conn = ConnectionFactory.recuperarConexao();
			
			for(CsvDados itemLista : salvarDados){
				pstm = (PreparedStatement) conn.prepareCall(sql);				
				pstm.setString(1, itemLista.getNome());//parâmetros dos campos
				pstm.setInt(2, itemLista.getIdade());
				pstm.setString(3, itemLista.getSexo());	
				pstm.execute();//executa a query
			}
			
			System.out.println("Registro salvado com sucesso!");
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {	
					if(pstm!=null) {
						pstm.close();
					}if(conn!=null) {
						conn.close();						
					}						
				} catch (Exception e) {
					e.printStackTrace();
				}			
			}
	}
	
	//LER
	public void exibir() {
		String sql = "SELECT * FROM pessoas";//pega tudo o que tem na tabela	
		Connection conn = null;
		PreparedStatement pstm = null;		
			try {
				conn = ConnectionFactory.recuperarConexao();
				pstm = (PreparedStatement) conn.prepareCall(sql);		
				ResultSet rs = pstm.executeQuery();
				//Faz a verificação de enquanto conter registros, percorre e resgata os valores
				System.out.println("ID NOME IDADE SX");
				while(rs.next()){
				    //Recupera valor referente ao nome da coluna
				    int id = rs.getInt(1);//aqui eu passo a posição do valor em relação a tabela
				    //Recupera o índice do campo referente ao campo id
				    System.out.print(id+" ");
				    
				    String nome = rs.getString(2);//passo ou o index "número da posição" ou o nome do campo entre " "
				    System.out.print(nome+" ");
				    
				    String idade = rs.getString(3);//passo ou o index "número da posição" ou o nome do campo entre " "
				    System.out.print(idade+" ");
				    
				    String sexo = rs.getString(4);//passo ou o index "número da posição" ou o nome do campo entre " "
				    System.out.print(sexo+" ");				    
				    System.out.println("");
				}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					try {	
						if(pstm!=null) {
							pstm.close();
						}if(conn!=null) {
							conn.close();						
						}
							
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}		
		}

	//ATUALIZAR
	public void atualizar(CsvDados atualizarDados) {
		String sql = "UPDATE pessoas SET nome=?, idade=?, sexo=? WHERE id=?";//pega tudo o que tem na tabela	
		Connection conn = null;
		PreparedStatement pstm = null;
		
			try {
				conn = ConnectionFactory.recuperarConexao();
				pstm = (PreparedStatement) conn.prepareCall(sql);	
				pstm.setString(1, atualizarDados.getNome());
				pstm.setInt(2, atualizarDados.getIdade());
				pstm.setString(3, atualizarDados.getSexo());
				pstm.setInt(4, atualizarDados.getId());
				
				int rs = pstm.executeUpdate();
				System.out.println(rs);
				
				System.out.println("Valores atualizados.");	
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					try {	
						if(pstm!=null) {
							pstm.close();
						}if(conn!=null) {
							conn.close();						
						}
							
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}		
		}
	//REMOVER
	public void remover(int idParaApagar) {
		String sql = "DELETE FROM pessoas WHERE id=?";	
		Connection conn = null;
		PreparedStatement pstm = null;
		
			try {
				conn = ConnectionFactory.recuperarConexao();
				pstm = (PreparedStatement)conn.prepareCall(sql);		
			
				pstm.setInt(1, idParaApagar);			
				pstm.execute();//executa a query
				System.out.println("Registro removido com sucesso.");
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					try {	
						if(pstm!=null) {
							pstm.close();
						}if(conn!=null) {
							conn.close();						
						}
							
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}		
		}
}
