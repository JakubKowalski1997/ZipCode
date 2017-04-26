package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * Created by Jakub Kowalski on 24.04.2017.
 */
public class ZipCode {
    String c;
    String d;
    public ZipCode(String a) {

                    try {
                // 1.Get a conection to database
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "student");
                // 2.Create a statement
                Statement myStmt = myConn.createStatement();
                // 3. Process the result set
                String SQL = "SELECT * FROM kody WHERE kod='" + a + "'";

                ResultSet myRs = myStmt.executeQuery(SQL);

                while (myRs.next()) {
                     c = myRs.getString("kod");
                     d = myRs.getString("miej");
                } //Get information from SQL
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }

