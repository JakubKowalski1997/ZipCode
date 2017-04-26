package sample;
import java.sql.*;
import java.util.Scanner;
public abstract class ZipCodeBackEnd {

    public void text() {


            try {
                // 1.Get a conection to database
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "student");
                // 2.Create a statement
                Statement myStmt = myConn.createStatement();

                // 4. Process the result set
                System.out.println("Enter the zipcode");

                String kod;
                Scanner odczyt = new Scanner(System.in);
                kod = odczyt.next();

                String SQL = "SELECT * FROM kody WHERE kod='" + kod + "'";

                ResultSet myRs = myStmt.executeQuery(SQL);

                while (myRs.next()) {
                    System.out.println("Zipcode: " + myRs.getString("kod"));
                    System.out.println("Miasto: " + myRs.getString("miej"));

                }
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }

}