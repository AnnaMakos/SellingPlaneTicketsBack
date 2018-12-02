package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/lotydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "passwordadmin";

        try{
            System.out.println("Connecting to database");

            Connection myConn = DriverManager.getConnection(jdbcUrl,user,password);

            System.out.println("Connection succesful byku XD");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
