package model;

import java.sql.*;

/**
 * This class implements a connection to MySQL server. It realizes retrieving,
 * updating, deleting... the basic SQL queries. results and updating.
 * 
 * @author Shen Duan
 * @version 1.0
 *
 */
public class DBConnector {

	/**
	 * Retrieves results from the Database.
	 */
	public void retrieveResults() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cookbook", "root", "");
			Statement stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM recipe;");
			while (rset.next()) {
				String recipeName = rset.getString("name");
				int servingCount = rset.getInt("servings");
				int prepTime = rset.getInt("preparationTime");
				int cookingTime = rset.getInt("cookingTime");
				System.out.println("recipe name: " + recipeName + ", servings: " + servingCount + ", preparation time: "
						+ prepTime + ", cooking time: " + cookingTime);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Updates the name and servings.
	 */
	public void update() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cookbook", "root", "");
			Statement stmt = con.createStatement();
			int rowCount = stmt.executeUpdate("INSERT INTO recipe (name, servings) VALUES('Xiao Longbao',4)");
			System.out.println("the row count of the updated recipe is " + rowCount);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Recipe r) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cookbook", "root", "");
			Statement stmt = con.createStatement();
			int rowCount = stmt.executeUpdate(
					"INSERT INTO recipe (name, servings, preparationTime, cookingTime) VALUES('" + r.getRecipeName()
							+ "', " + r.getServings() + ", " + r.getCookingTime() + ", " + r.getPreparationTime() + ")");
			System.out.println("the row count of the updated recipe is " + rowCount);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
