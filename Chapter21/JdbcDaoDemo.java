import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class JdbcDaoDemo {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student s1 = dao.getStudent(13);
        System.out.println(s1.sname);
    }
}


    class StudentDAO {

        public Student getStudent(int rollno){

            try {
                Student s = new Student();
                s.rollno = rollno;
                String query = "select sname from student where rollno=" + rollno;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/studyq","admin","password");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                rs.next();
                String name = rs.getString(1);
                s.sname = name;
                return s;
            } catch (Exception ex) {
                System.out.println(ex);
            }
            return null ;

        }
    }

    class Student
    {
        int rollno;
        String sname;

    }

