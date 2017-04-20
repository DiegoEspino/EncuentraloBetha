package proyects.carosdrean.xyz.encuentralobetha.pojo;

/**
 * Created by josue on 19/04/2017.
 */

public class EmpresaVenta {

    private String categoria;
    private String nombreEmpresa;
    private String direccion;
    private String descripcion;
    private int logo;

    public EmpresaVenta() {
    }

    public EmpresaVenta(String categoria, String nombreEmpresa, String direccion, String descripcion, int logo) {
        this.categoria = categoria;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.logo = logo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
