package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainDb {

public static void main (String [] args){
    try( Connection c = conectarDB("jdbc:mysql://localhost:3306/curso_intro_sql","root","")){
        
        Statement st =c.createStatement();
        ResultSet rs =st.executeQuery("Select * from articulos");
        
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            String nombre = rs.getString("nombre");
            System.out.println(codigo+":"+nombre);
        }
        /*
        Statement stIntert = c.createStatement();
        stIntert.execute("insert into curso (nombre) values ")
        */
        
    }catch (SQLException ex){
        Logger.getLogger(MainDb.class.getName()).log(Level.SEVERE, null, ex);
    }
}    


public static Connection conectarDB(String strConnection, String usuario, String clave) throws SQLException{
    return DriverManager.getConnection(strConnection, usuario, clave);
}

}