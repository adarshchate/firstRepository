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

        String url = "jdbc:postgresql://localhost:5432/demoDB";
        String uname = "postgres";
        String pass = "pass";

//        Class.forName("org.postgresql.Driver");  /// not compulsory
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");

//        String sql = "select sname from student where sid=1";
        String sql = "select * from student";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

//        System.out.println(result.next());

//        rs.next();  //  point to the first column
//        String name = rs.getString("sname");
//        System.out.println("Name is: " + name);

        // print all the data
        while (rs.next()) {
            System.out.print(rs.getString(1) + " : ");
            System.out.print(rs.getString(2) + " : ");
            System.out.println(rs.getString(3));
        }

        con.close();
        System.out.println("connection is closed");


    }
}
