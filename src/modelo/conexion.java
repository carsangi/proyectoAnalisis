package modelo;








import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
        Connection conectat = null;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectat=DriverManager.getConnection("jdbc:mysql://localhost/proyectoanalisis","root","");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectat;
    }
}
