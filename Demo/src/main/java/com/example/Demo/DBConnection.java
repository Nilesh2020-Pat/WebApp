package com.example.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;

public class DBConnection {
	public Connection getDBCOnnection(){
		Connection conn=null;
		
		try{
	         Class.forName("org.postgresql.Driver");
	         conn = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/postgres",
	            "postgres", "Nilesh.@1994");
	         System.out.println("conn succesfully");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
		return conn;
	}
	public List<Person> getPersonDetails() throws SQLException{
		List<Person> list = new ArrayList<>();
		Connection con = getDBCOnnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql ="Select * from person";
		pst  = con.prepareStatement(sql);
		 rs = pst.executeQuery();
		while(rs.next()){
			Person per = new Person();
			per.setId(rs.getInt("id"));
			per.setFname(rs.getString("fname"));
			per.setAge(rs.getInt("age"));
			list.add(per);
		}
		return list;
	}
	 public int insertdataintoDB(int id,String name,int age) throws SQLException{
		 Connection con = getDBCOnnection();
		 PreparedStatement pst = null;
		 String sql = "insert into person values(?,?,?)";
		 pst = con.prepareStatement(sql);
		 pst.setInt(1, id);
		 pst.setString(2, name);
		 pst.setInt(3, age);
		int row =  pst.executeUpdate();
		if(row > 0){
			System.out.println("new data inserted into database:"+ id +" " + name +" "
					+ age);
		}
		 return row;
	 }
	 public int insertdataintoDB(Person p) throws SQLException{
		 Connection con = getDBCOnnection();
		 PreparedStatement pst = null;
		 String sql = "insert into person values(?,?,?)";
		 pst = con.prepareStatement(sql);
		 pst.setInt(1, p.getId());
		 pst.setString(2, p.getFname());
		 pst.setInt(3, p.getAge());
		int row =  pst.executeUpdate();
		if(row > 0){
			System.out.println("new data inserted into database:"+ p.getId() +" " + p.getFname() +" "
					+ p.getAge());
		}
		 return row;
	 }
	 public int updateData(Person p) throws SQLException{
			Connection conn= getDBCOnnection();
			int count = 0;
			PreparedStatement pst= null;
			String sql = "update person set fname = ? ,age = ? where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, p.getFname());
			pst.setInt(2, p.getAge());
			pst.setInt(3, p.getId());
			count  = pst.executeUpdate();
		     System.out.println("Database updated successfully :"+ count);
			return count;
		}
	 public int deleteId(int id) throws SQLException{
		   Connection conn= getDBCOnnection();
			int count = 0;
			PreparedStatement pst= null;
			String sql= " delete from person where id =?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
		    count = pst.executeUpdate();
		    System.out.println("Deleted successfully :"+ count);
			return count;

		 
	 }
}
