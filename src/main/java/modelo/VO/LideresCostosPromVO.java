package modelo.VO;

public class LideresCostosPromVO {
    
    private String Nombre;
    private String Promedio;

    public LideresCostosPromVO(String Nombre,String Promedio)
    {
        this.Nombre=Nombre;
        this.Promedio=Promedio;
    }

    public String getNombre()
    {
        return Nombre;
    }
    public void setNombre(String Nombre)
    {
        this.Nombre= Nombre;
    }

    public String getPromedio()
    {
        return Promedio;
    }
    public void setPromedio(String Promedio)
    {
        this.Promedio= Promedio;
    }

}
