package modelo.DAO;

import util.JDBCutilities;//QUIEN CONECTA A LA BASE DE DATOS.

import java.util.ArrayList;
import modelo.VO.MaterialesProyectosVO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaterialesProyectosDAO {

    public ArrayList<MaterialesProyectosVO> consultarMaterialesProyectos() throws SQLException 
    {

       ArrayList<MaterialesProyectosVO> respuesta = new ArrayList<MaterialesProyectosVO>();

       Connection conexion = JDBCutilities.getConnection();
       
       String sql = "SELECT mc.Nombre_Material, mc.Precio_Unidad, SUM(c.Cantidad) Total FROM Proyecto p LEFT JOIN Compra c ON p.ID_Proyecto= c.ID_Proyecto LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion WHERE p.ID_Proyecto IN (183,331,352,365,76) GROUP BY mc.Nombre_Material ORDER BY mc.Nombre_Material";

       Statement st =   conexion.createStatement();
       ResultSet rs = st.executeQuery(sql);
       
       while(rs.next())
       {
            String Nombre_Material = rs.getString("Nombre_Material");
            Integer Precio_Unidad = rs.getInt("Precio_Unidad");
            Integer Total = rs.getInt("Total");

            MaterialesProyectosVO registro = new MaterialesProyectosVO(Nombre_Material, Precio_Unidad, Total);

            respuesta.add(registro);
       }
       
       return respuesta;

    }
}
