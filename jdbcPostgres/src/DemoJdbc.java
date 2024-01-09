import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
         * Import Package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the result
         * close
         */

        String url="jdbc:postgresql://localhost:5432/demoDB";
        String uname="postgres";
        String pass="pass";

//        Class.forName("org.postgresql.Driver");  /// not compulsory
        Connection con = DriverManager.getConnection(url, uname, pass);

        System.out.println("Connection Established");

    }
}
