package com.ysh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ysh.model.User;

public class UserDAO {

		private String url = "jdbc:mysql://localhost:3306/test";
		private String userName = "root";
		private String passWord = "Gygshwr#01";
		
		private final String INSERT_USER =  "insert into user_details (name,email,country) 	values (?,?,?);";
		private final String SELECT_USER_BY_ID = "select id,name,email,country from user_details where id = ?;";
		private final String SELECT_ALL_USERS =  "select * from user_details;";
		private final String DELETE_USER = 	  "delete from user_details where id = ?";
		private final String UPDATE_USER = "update user_details set name = ?, email = ?, country = ? where id = ?";
		
		
		protected Connection getConnection() throws ClassNotFoundException {
			Connection connection = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url,userName,passWord);
			} catch(SQLException e) {
				e.printStackTrace();
			}
			return connection;	
		}
		
		public void insertUser(User user) {
			try {
				Connection connection = getConnection();
				PreparedStatement prep = connection.prepareStatement(INSERT_USER);
				prep.setString(1, user.getName());
				prep.setString(2, user.getEmail());
				prep.setString(3, user.getCountry());
				prep.executeUpdate();
			}
			catch(Exception E) {
				E.printStackTrace();
			}
		}
		
		public boolean updateUser(User user) {
			boolean result = false;
			try {
				Connection connection = getConnection();
				PreparedStatement prep = connection.prepareStatement(UPDATE_USER);
				prep.setString(1, user.getName());
				prep.setString(2, user.getEmail());
				prep.setString(3, user.getCountry());
				prep.setInt(4, user.getID());
				prep.executeUpdate();
				
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			return result;
		}
		
		public User selectUser(int ID) throws ClassNotFoundException {

			User user = null;
			Connection connection = getConnection();
			
			try {
				 connection = getConnection();
				PreparedStatement prep = connection.prepareStatement(SELECT_USER_BY_ID);
				prep.setInt(1, ID);
				ResultSet result = prep.executeQuery();
				
				while(result.next()) {
					String name = result.getString("name");
					String email = result.getString("email");
					String country = result.getString("country");
					user = new User(ID,name,email,country);
				}
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			return user;
		}
		
		public List<User> selectAllUsers() throws ClassNotFoundException {
			List<User> users = new ArrayList<User>();
			Connection connection = getConnection();
				
			try {
				 connection = getConnection();
				PreparedStatement prep = connection.prepareStatement(SELECT_ALL_USERS);
				ResultSet result = prep.executeQuery();
				
				while(result.next()) {
					User user;
					int id = result.getInt("ID");
					String name = result.getString("name");
					String email = result.getString("email");
					String country = result.getString("country");
					user = new User(id,name,email,country);
					users.add(user);
				}
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			return users;
		}

		public boolean deleteUser(int ID)throws SQLException {
			boolean result = false;
			try {
				Connection connection = getConnection();
				PreparedStatement prep = connection.prepareStatement(DELETE_USER);
				prep.setInt(1, ID);
				result = prep.executeUpdate() > 0;
				
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			return result;
		}
}
