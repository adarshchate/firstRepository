import java.sql.*;


public class CurdOperation {

    public static void main(String[] args) throws SQLException {

        /*
         * Import Package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the result
         * close
         */

        int sid = 102;
        String sname = "harsh";
        int marks = 77;


        String url = "jdbc:postgresql://localhost:5432/demoDB";
        String uname = "postgres";
        String pass = "pass";

        Connection con = DriverManager.getConnection(url, uname, pass); // connection
        System.out.println("connection established");

//         to improve performance and avoid sql injection need to cached using prepared statement
//        String sql = "insert into student values(" + sid + ",'" + sname + "'," + marks + ")";

//        String sql = "insert into student values(5,'mayur',76)";
//        String sql = "update student set sname='max' where sid=3";
//        String sql = "delete from student where sid=5";


//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql); /// get data for getting result set
//        st.execute(sql);

        String sql = "insert into student values(?,?,?)";
        PreparedStatement st = con.prepareStatement(sql);

        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute();

        con.close(); // connection closed
        System.out.println("Connection Closed");

    }
}
