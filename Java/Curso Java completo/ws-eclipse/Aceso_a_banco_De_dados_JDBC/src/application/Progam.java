package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Progam {

	public static void main(String[] args) {

		/*
		 * Connection conn = DB.getConnection(); DB.closeConnection();
		 * 
		 * 
		 * Connection conn = DB.getConnection();
		 * 
		 * if (conn != null) { System.out.println("Conexão estabelecida com sucesso!");
		 * } else { System.out.println("Falha ao estabelecer a conexão."); }
		 * 
		 * DB.closeConnection(); // Agora o nome do método está corrigido.
		 * 
		 * System.out.println("Conexão fechada.");
		 * 
		 */
		
		Connection conn = null; //Conexão com o banco
		Statement st = null;    //Consulta SQL
		ResultSet rs = null;	//Guardar o resultado da consulta
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from department");
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+" , "+rs.getString("Name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
