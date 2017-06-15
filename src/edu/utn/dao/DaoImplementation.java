package edu.utn.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import edu.utn.model.*;

public class DaoImplementation implements IDao<Jugador, Boolean, String> {

	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/modavanzadotp1";
	private static final String ID = "root";
	private static final String PASS = "";
	
	
//	private static final String DELETE = "DELETE FROM Jugador WHERE id=?";
//	private static final String FIND_ALL = "SELECT * FROM Jugador ORDER BY id";
//	private static final String FIND_BY_ID = "SELECT * FROM Jugador WHERE id=?";
//	private static final String FIND_BY_NAME = "SELECT * FROM Jugador WHERE name=?";
	private static final String INSERT = "INSERT INTO Jugador(nombre, apellido, posicion, edad, peso, altura, califiacion) VALUES(?, ?, ?, ?, ?, ?, ?)";
//	private static final String UPDATE = "UPDATE Jugador SET califiacion=? WHERE id=?";
	
	@SuppressWarnings("finally")
	public static Connection conexionDB(){
//		JDK < 1.5
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			//jdbc:mysql://servidor:puerto/baseDeDatos o esquema
			Connection con = null;
			con = (Connection)DriverManager.getConnection(DB_URL, ID, PASS);

			System.out.println("Conección exitosa!!");
			
			return con;

		} catch (Exception e) {
			throw new SQLException(e);
			//throw new RuntimeException(e);
		} finally {
			return null;
		}
	
	}

	@Override
	public Boolean insert(Jugador jugador) {
		Connection conn = DaoImplementation.conexionDB();
		
		try {
			PreparedStatement ps = null; 
			ps = (PreparedStatement)conn.prepareStatement(INSERT);
			
			//nombre, apellido, posicion, edad, peso, altura, califiacion
			ps.setString(1, jugador.getNombre());
			ps.setString(2, jugador.getApellido());
			ps.setString(3, jugador.getPosicion().name());
			ps.setInt(4, jugador.getEdad());
			ps.setInt(5, jugador.getPeso());
			ps.setDouble(6, jugador.getAltura());
			ps.setInt(7, jugador.getCalificacion());
			ps.executeUpdate();
			// guardamos la tabla que viene x la base de datos
			ps.execute();

			// Retorno el alumno cargado de la base
			System.out.println("Se inserto correctamente el Jugador " + jugador.getApellido() + " en la BD");
			
			conn.close();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}



	@Override
	public int delete(Jugador u) {
		return 0;
	}



	@Override
	public List<Jugador> findAll() {
		return null;
	}

	@Override
	public Jugador findById(int id) {
		return null;
	}



	@Override
	public Jugador findByName(java.lang.String s) {
		return null;
	}



	@Override
	public Boolean update(Jugador u) {
		return null;
	}
	
	
}
