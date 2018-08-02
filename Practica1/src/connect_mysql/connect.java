/*
 *FeakLearn Java Practice.
 */
package connect_mysql;

//import com.mysql.jdbc.Connection;
//import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author FreakLearn: Carlos Gallegos
 */
public class connect {
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";//standar info for the driver
    private static final String user = "root";//your DB user
    private static final String password = "";//The user password
    private static final String url = "jdbc:mysql://localhost:3306/tienda";// jdbc:mysql://your own url:port/db name
    
    public connect(){//function call to execute the connection
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if(con != null){
                System.out.println("Conexion establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar "+ e);
               
        }
    }
    public Connection getCon(){//retrive the connection
        return con;
    }
}
