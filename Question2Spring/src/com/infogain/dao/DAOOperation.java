package com.infogain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.infogain.beans.Product;
import com.infogain.db.DBclass;

public class DAOOperation {

	DataSource datasource;
		
	public void addProducts(int pid,String pName,int pcost,int quantity)
	{
	

		try {
			Connection con = datasource.getConnection();
             System.out.println(con);
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, pid);
			ps.setString(2, pName);
			ps.setInt(3, pcost);
			ps.setInt(4, quantity);
			ResultSet  rs = ps.executeQuery();
			while (rs.next()) {
			System.out.println("product added successfully");
			
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}//end addproducts
	public void searchProduct(int id)
	{

		try {
			Connection con = datasource.getConnection();
             System.out.println(con);
			PreparedStatement ps = con.prepareStatement("select * from product where pid=? ");
			ps.setInt(1, id);
			
			ResultSet  rs = ps.executeQuery();
			while (rs.next()) {
			System.out.println(rs);
			
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}//end search
	
	public boolean updateProduct(int pid,int unitSold)
	{
		 boolean update=false;
		try {
			Connection con = datasource.getConnection();
             System.out.println(con);
			PreparedStatement ps = con.prepareStatement("Upadte table product pid=? and quantity=?");
			ps.setInt(1, pid);
			ps.setInt(2, unitSold);
			
			int  rs = ps.executeUpdate();
			while (rs!=0) {
			System.out.println(rs);
			
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		update=true;
		return update;
		
	}
	
	
}//end class
