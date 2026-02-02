package sqlite;

import java.sql.*;

public class showAllCompanies {

    public static void showAllCompanies() {
        String url = "jdbc:sqlite:C:/Users/user/Documents/companies.db";

        try (Connection c = DriverManager.getConnection(url);
             Statement s = c.createStatement();
             ResultSet r = s.executeQuery("SELECT * FROM companies")) {

            while (r.next()) {
                System.out.format("%d : %s - %s%n",
                        r.getInt("id"),
                        r.getString("name"),
                        r.getString("country"));
            }

        } catch (Exception x) {
            System.err.println(x.getMessage());
        }
    }
}
