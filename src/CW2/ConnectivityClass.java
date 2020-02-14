package CW2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectivityClass {
    public Connection connection;
    public Connection getConnection(){

        String databaseName = "CW2";
        String employee="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+databaseName,employee,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
