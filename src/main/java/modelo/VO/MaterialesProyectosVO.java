package modelo.VO;

public class MaterialesProyectosVO {
    
    private String Nombre_Material;
    private Integer Precio_Unidad;
    private Integer Total;

    public MaterialesProyectosVO(String Nombre_Material,Integer Precio_Unidad,Integer Total)
    {
        this.Nombre_Material=Nombre_Material;
        this.Precio_Unidad=Precio_Unidad;
        this.Total=Total;
    }

    public String getNombre_Material()
    {
        return Nombre_Material;
    }
    public void setNombre_Material(String Nombre_Material)
    {
        this.Nombre_Material= Nombre_Material;
    }

    public Integer getPrecio_Unidad()
    {
        return Precio_Unidad;
    }
    public void setPrecio_Unidad(Integer Precio_Unidad)
    {
        this.Precio_Unidad= Precio_Unidad;
    }

    public Integer getTotal()
    {
        return Total;
    }
    public void setTotal(Integer Total)
    {
        this.Total= Total;
    }


}
