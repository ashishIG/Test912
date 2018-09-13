package com.infogain.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;


import com.infogain.beans.Product;

public class DBclass {
	
	DataSource datasource;

	public DBclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBclass(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	
	}



