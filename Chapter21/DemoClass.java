import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;



/*
    * 1. Import ---> java.sql
    * 2. Load and register the driver ---> com.mysql.cj.jdbc.Driver
    * 3. Create Connection ---> Connection
    * 4. Create a statement ---> Statement
    * 5. Execute the query
    * 6. process the results
    * 7. close
    *
 */


public class DemoClass {
    public static void main (String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/alien?allowPublicKeyRetrieval=true&useSSL=false";
        String uname = "admin";
        String pass = "password";
        String query = "select username from student where userid=3";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, uname, pass);
    Statement st = con.createStatement();
    st.executeQuery(query);
    ResultSet rs = st.executeQuery(query);

    rs.next();

    String name = rs.getString("userName");

    System.out.println(name);

    st.close();
    con.close();
    }
}
