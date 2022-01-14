import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class JdbcDaoDemo {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student s2 = new Student();
        s2.rollno = 15;
        s2.sname = "Mariachan";
        dao.connect();
        dao.addStudent(s2);
    }
}


    class StudentDAO {
        Connection con = null;
        public void connect()
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/studyq","admin","password");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        public Student getStudent(int rollno){

            try {
                Student s = new Student();
                s.rollno = rollno;
                String query = "select sname from student where rollno=" + rollno;

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

        public void addStudent(Student s)
        {
            String query = "insert into student values (?,?)";
            PreparedStatement pst = null;
            try {
                pst = con. prepareStatement(query);
                pst.setInt(1, s.rollno );
                pst.setString(2, s.sname );
                pst.executeUpdate();



            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }


    class Student
    {
        int rollno;
        String sname;

    }

