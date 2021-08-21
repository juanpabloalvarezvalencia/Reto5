package modelo.VO;

public class LideresDocsBaqVO {
 
    private String Nombre;
    private String Documento;

    public LideresDocsBaqVO(String Nombre,String Documento)
    {
        this.Nombre=Nombre;
        this.Documento=Documento;
    }

    public String getNombre()
    {
        return Nombre;
    }
    public void setNombre(String Nombre)
    {
        this.Nombre= Nombre;
    }

    public String getDocumento()
    {
        return Documento;
    }
    public void setDocumento(String Documento)
    {
        this.Documento= Documento;
    }


}
