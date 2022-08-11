package model.repository;

import model.Banco;
import model.entities.Vacina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class VacinaRepository {
	
	//CRUD
	//Create
	public Vacina inserir(Vacina novaVacina) {
		//Conectar no banco
				Connection conexao = Banco.getConnection();
				String sql = ;
		return novaVacina;
	}
	
	//Update
	public Vacina atualizar(Vacina vacina) {
		//TODO
		//UPDATE VACINA SET ESTAGIO_PESQUISA = 2
		//WHERE ID = 2;
		return vacina;
	}
	
	//Delete
	public boolean excluir(int id) {
		boolean excluiu = false;
		
		//Conectar no banco
		Connection conexao = Banco.getConnection();
		String sql = " DELETE FROM VACINA "
				+ " WHERE ID = ? ";
		//Obter o preparedStatement
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql);
		try {
			//Executar
			stmt.setInt(1, id);
			int registrosExcluidos = stmt.executeUpdate();
			excluiu = (registrosExcluidos > 0);
		} catch (SQLException e) {
			System.out.println("Erro ao excluir vacina.\nCausa: " + e.getCause());
		}
		
		return excluiu;
	}
	
	//Retrieve
	public Vacina pesquisarPorId(int id) {
		//TODO
		//SELECT * FROM VACINA
		//WHERE ID = 2;
		
		return null;
	}
	
	public ArrayList<Vacina> pesquisarTodas(){
		//TODO
		//SELECT * FROM VACINA
		return null;
	}
	
}