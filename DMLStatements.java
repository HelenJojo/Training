package com.helen;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DMLStatements {
	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept", "root", "Cupcake@17");

		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to do? (insert,update,delete,retreive)");
		String command = in.next();

		PreparedStatement insert = con.prepareStatement("insert into employee values(?,?,?,?,?)");
		String sqlInsert = "insert into employee " + "(no,firstname,lastname,email,eaddress)" + "values (?,?,?,?,?)";

		PreparedStatement update = con.prepareStatement("update employee set eaddress = ? where no = ?");

		PreparedStatement delete = con.prepareStatement("delete  from employee where no = ?");

		PreparedStatement retreive = con.prepareStatement("select * from employee where firstname = ? or lastname= ?");

		switch (command) {
		case "insert":
			command = "insert";
			System.out.println("Enter your employee ID");
			Integer id = in.nextInt();

			System.out.println("Enter your first name");
			String firstname = in.next();

			System.out.println("Enter your last name");
			String lastname = in.next();

			System.out.println("Enter your email Id");
			String email = in.next();

			System.out.println("Enter your address");
			String address = in.next();

			insert.setInt(1, id);
			insert.setString(2, firstname);
			insert.setString(3, lastname);
			insert.setString(4, email);
			insert.setString(5, address);
			insert.executeUpdate();
			System.out.println("inserted");

			break;
		case "update":
			command = "update";
			System.out.println("Enter the employee ID that u want to update");
			Integer id1 = in.nextInt();

			System.out.println("Enter your new address");
			String address1 = in.next();

			update.setString(1, address1);
			update.setInt(2, id1);

			update.executeUpdate();

			System.out.println("updated");
			break;
		case "delete":

			command = "delete";
			System.out.println("Enter the id of the employee u want to delete");
			Integer id2 = in.nextInt();

			delete.setInt(1, id2);
			delete.executeUpdate();

			System.out.println("Entry Deleted");
			break;

		case "retreive":
			command = "retreive";
			System.out.println("Enter your firstname or lastname");
			String name = in.next();
			PreparedStatement ps= con.prepareStatement("select * from employee where lastname =? or firstname=?");
			ps.setString(1, name);
			ps.setString(2, name);
		
			ResultSet rs = ps.executeQuery();
			

			while (rs.next()) {
				System.out.println("Employee ID :" + rs.getInt(1));
				System.out.println("First Name :" + rs.getString("firstname"));
				System.out.println("Last Name :" + rs.getString("lastname"));
				System.out.println("Email :" + rs.getString("email"));
				System.out.println("Address :" + rs.getString("eaddress"));

			}
			break;

		default:
			System.out.println("Choose the correct command!!!");
			break;

		}
		
		
		System.out.println("Enter the no of the employee you want to retrieve ");
		Integer num = in.nextInt();

		CallableStatement cs= con.prepareCall("{call call_procedure(?)}");

		cs.setInt(1, num);

		ResultSet rset = cs.executeQuery();
		while (rset.next()) {
			System.out.print("Employee No :" + rset.getInt(1) + " \t");
			System.out.print("Employee first name :" + rset.getString("firstname") + " \t");
			System.out.print("Employee Last name :" + rset.getString("lastname") + " \t");
			System.out.print("Employee email :" + rset.getString("email") + " \t");
			System.out.print("Employee address :" + rset.getString("eaddress") + " \t");

		}
	}
}
