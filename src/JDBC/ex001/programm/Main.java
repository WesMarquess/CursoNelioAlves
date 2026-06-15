package JDBC.ex001.programm;


import JDBC.ex001.db.DB;
import JDBC.ex001.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("""
                    INSERT INTO seller
                    (Name, Email, BirthDate, BaseSalary, DepartmentId)
                    VALUES
                    (?, ?, ?, ?, ?)
                    """, Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Weslley");
            st.setString(2, "Wes@gmail.com");
            st.setDate(3, new java.sql.Date(simpleDateFormat.parse("05/04/2000").getTime()));
            st.setDouble(4, 3501.05);
            st.setInt(5, 2);
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected");
            }


        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
