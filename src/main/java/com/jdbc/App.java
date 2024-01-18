package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        try {
			Class.forName("org.postgresql.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Jdbc","postgres","12345");
			Statement stmt = con.createStatement();
			           ResultSet rs = stmt.executeQuery("select * from employee");
			           
			           while(rs.next())
			        	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+""+rs.getInt(4));
			           con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
    }

