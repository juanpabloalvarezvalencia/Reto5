package modelo.DAO;

import util.JDBCutilities;//QUIEN CONECTA A LA BASE DE DATOS.

import java.util.ArrayList;
import modelo.VO.LideresDocsBaqVO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LideresDocsBaqDAO {
 
    public ArrayList<LideresDocsBaqVO> consultarLideresDocsBaq() throws SQLException 
    {

       ArrayList<LideresDocsBaqVO> respuesta = new ArrayList<LideresDocsBaqVO>();

       Connection conexion = JDBCutilities.getConnection();
       
       String sql = "SELECT Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido as Nombre, Documento_Identidad from Lider where Ciudad_Residencia = 'Barranquilla' order by Nombre";

       Statement st =   conexion.createStatement();
       ResultSet rs = st.executeQuery(sql);
       
       while(rs.next())
       {
            String Nombre = rs.getString("Nombre");
            String Documento = rs.getString("Documento_Identidad");

            LideresDocsBaqVO registro = new LideresDocsBaqVO(Nombre, Documento);

            respuesta.add(registro);
       }
       
       return respuesta;

    }


}
