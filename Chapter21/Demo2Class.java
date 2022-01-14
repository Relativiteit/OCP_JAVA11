// Class.forName()

import java.sql.DriverManager;

public class Demo2Class {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
       // Connection con = Dr
    }
}


class Pqr
{
    static
    {
        System.out.println("in Static ");
    }


    // instance
    {
        System.out.println("in instance ");
    }
}