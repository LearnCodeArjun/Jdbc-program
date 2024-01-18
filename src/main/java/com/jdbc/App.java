package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "this is crud opertion through jdbc" );
        
        
        try {
        	//load and register the driver class
			Class.forName("org.postgresql.Driver"); 
			
			//create connection object
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Jdbc","postgres","12345");
			
			//create statement
			Statement st = con.createStatement();
			           //execute the query
			          // select query
			           ResultSet rs = st.executeQuery("select * from employee");
			           while(rs.next())
			        	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+""+rs.getInt(4));
			        	   
			           //insert query
			           int r=st.executeUpdate("insert into employee values(112,'aman','patana',896754354)");
			           System.out.println(r+"record affected");
			           
			           //update query
			              int r1=st.executeUpdate("update employee set name='diksha'where id=112");
			              System.out.println(r1+"updated");
			           
			           //delete query
			           int r2=st.executeUpdate("delete from employee where id=112");
			           System.out.println(r2+"deleted ");
			           
			           //close the connection
			           con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
    }

