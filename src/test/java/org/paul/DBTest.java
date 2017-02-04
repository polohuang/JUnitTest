package org.paul;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DBTest {
	Connection conn = null;

	@Before
	public void init() {
		conn = DBConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into user(name,email) values('Paul','shokai036@gmail.com')");
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void Test() {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("name") + "," + rs.getString("email"));
				Assert.assertEquals("Paul", rs.getString("name"));
				Assert.assertEquals("shokai036@gmail.com", rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void destroy() throws SQLException {
		PreparedStatement ps = conn.prepareStatement("delete from user");
		ps.executeUpdate();
		conn.close();
	}
}
