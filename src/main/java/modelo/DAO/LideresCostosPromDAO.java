package modelo.DAO;

import util.JDBCutilities;//QUIEN CONECTA A LA BASE DE DATOS.

import java.util.ArrayList;
import modelo.VO.LideresCostosPromVO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LideresCostosPromDAO {
 
    public ArrayList<LideresCostosPromVO> consultarLideresCostosProm() throws SQLException 
    {

       ArrayList<LideresCostosPromVO> respuesta = new ArrayList<LideresCostosPromVO>();

       Connection conexion = JDBCutilities.getConnection();
       
       String sql = "SELECT Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido as Nombre, SUM(c.Cantidad * mc.Precio_Unidad) / COUNT(DISTINCT  p.ID_Proyecto) Promedio FROM Lider l LEFT JOIN Proyecto p ON l.ID_Lider = p.ID_Lider LEFT JOIN Compra c ON p.ID_Proyecto= c.ID_Proyecto LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion WHERE p.Ciudad = 'Pereira' GROUP BY l.ID_Lider HAVING COUNT(DISTINCT  p.ID_Proyecto) >= 2 ORDER BY Promedio DESC";

       Statement st =   conexion.createStatement();
       ResultSet rs = st.executeQuery(sql);
       
       while(rs.next())
       {
            String Nombre = rs.getString("Nombre");
            String Promedio = rs.getString("Promedio");

            LideresCostosPromVO registro = new LideresCostosPromVO(Nombre, Promedio);

            respuesta.add(registro);
       }
       
       return respuesta;

    }


}
