package com.tj.gitbranchingdemo.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.google.gson.Gson;
import com.tj.gitbranchingdemo.model.LogEntry;

//Data Access Layer
public class Dal {
	
	private Gson gson;
	private Connection conn;
	private String dbUrl = "jdbc:postgresql://localhost:5432/sq-injection-kitty-pg";
	
	@Autowired
	private JdbcTemplate jdbc;


		
		
		
		public Dal() {	
			this.gson = new Gson();
			try {
				this.conn = DriverManager.getConnection(dbUrl, "postgres", "postgres");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public String getEntryById(int id) throws SQLException {
			
			String sql = "SELECT * FROM log_entries WHERE id = ?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, String.valueOf(id));
			ResultSet result = statement.executeQuery(sql);
			
			LogEntry entry = null;
			while (result.next()) {
				String name = result.getString("name");
				String message = result.getString("message");
				String entryId = result.getString("id");
				entry = new LogEntry(name, message, Integer.parseInt(entryId), null);
			}
			
			return gson.toJson(entry);
			
		}
		
		public String getAllEntries() throws SQLException {
			
			String sql = "SELECT * FROM log_entries";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet result = statement.executeQuery(sql);
			
			List<LogEntry> entry = new ArrayList<LogEntry>();
			while (result.next()) {
				String name = result.getString("name");
				String message = result.getString("message");
				String entryId = result.getString("id");
				entry.add(new LogEntry(name, message, Integer.parseInt(entryId), null));
			}
			
			return gson.toJson(entry);
			
		}
				
		private String persistWithParameterizedQuery() {
			return "string";
		}
		
		private String persistWithoutParameterizedQuery() {
			return "string";
		}
		

}
