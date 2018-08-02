/*
 * FrakLearn
 */
package practica1;

//connect package import the file connect
import connect_mysql.connect;
//sql JAR
import java.sql.*;

/**
 *
 * @author FreakLearn Carlos Gallegos
 */
public class Practica1 {
    //connect con;

    public static void main(String[] args) {//this is your main function
        // TODO code application logic here
        /*to call the file of the package we just imported 
        we just need yo create an object with the name of the import file
        and then the name of the variable we are going to be using it with*/        
        connect con = new connect();
        
        String query = "SELECT * FROM users"; //the query we are going to execute
        
         Statement st;//this variable its ise by the jar file to call the actions you want to do 
         
         //we use a try and cath method for any error that could be thrown; ex. db not existing, table name, etc.
        try {
           st = con.getCon().createStatement();
           ResultSet rs = st.executeQuery(query);
            System.out.println("Consulto");
            if (!rs.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }else{ 
           while(rs.next()){
               int id = rs.getInt("id");
               String name = rs.getString("nombre");
               System.out.println("id: "+id+" nombre: "+name);
           }
            }
           st.close();
            
        } catch (SQLException e) {
            System.out.println("error: " + e);
        }
        
    }
    
}
