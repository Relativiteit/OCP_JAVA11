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
        String query = "insert into student values (4, 'Mohini')";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, uname, pass);
    Statement st = con.createStatement();
    st.executeQuery(query);
    ResultSet rs = st.executeQuery(query)); // DDL, DML ,DQL
        // DDL Data definition language change the structure of the database
        // DML Data manipulation language changing data inserting values updating existing rows
        // DQL Data query language fetching data query

    String userData = "";

    while(rs.next()) {

        userData = rs.getInt(1) + " : " + rs.getString(2);
        System.out.println(userData);
    }


    st.close();
    con.close();
    }
}
