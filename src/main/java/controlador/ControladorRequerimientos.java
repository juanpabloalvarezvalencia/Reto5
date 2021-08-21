package controlador;

import java.util.ArrayList;

import modelo.DAO.*;
import modelo.VO.*;

import java.sql.SQLException;


public class ControladorRequerimientos 
{
    
    private final MaterialesProyectosDAO materialesProyectosDAO;
    private final LideresDocsBaqDAO lideresDocsBaqDAO;
    private final LideresCostosPromDAO lideresCostosPromDAO;

    public ControladorRequerimientos()
    {
        materialesProyectosDAO = new MaterialesProyectosDAO();
        lideresDocsBaqDAO = new LideresDocsBaqDAO();
        lideresCostosPromDAO = new LideresCostosPromDAO();
    }

    public ArrayList<MaterialesProyectosVO> consultarMaterialesProyectos() throws SQLException
    {
        return  materialesProyectosDAO.consultarMaterialesProyectos();
    }

    public ArrayList<LideresDocsBaqVO> consultarLideresDocsBaq() throws SQLException
    {
        return  lideresDocsBaqDAO.consultarLideresDocsBaq();
    }

    public ArrayList<LideresCostosPromVO> consultarLideresCostosProm() throws SQLException
    {
        return  lideresCostosPromDAO.consultarLideresCostosProm();
    }
    
}
