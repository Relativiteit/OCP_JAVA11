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

// DOA -> Data Access Object
public class DemoClass {
    public static void main (String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/alien?allowPublicKeyRetrieval=true&useSSL=false"; 
        String uname = "admin";
        String pass = "password";
        int userid = 6;
        String username = "Mashall";
        String query = "insert into student values (?,?)";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, uname, pass);
    PreparedStatement st = con.prepareStatement(query); // PreparedStatement
        st.setInt(1, userid);
        st.setString(2, username);

    int count = st.executeUpdate(); // DDL, DML ,DQL
        // DDL Data definition language change the structure of the database
        // DML Data manipulation language changing data inserting values updating existing rows
        // DQL Data query language fetching data query

        System.out.println(count + " row/s affected");




    st.close();
    con.close();
    }
}
