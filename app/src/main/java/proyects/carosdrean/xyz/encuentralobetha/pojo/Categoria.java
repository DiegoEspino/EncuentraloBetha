package proyects.carosdrean.xyz.encuentralobetha.pojo;

/**
 * Created by josue on 19/04/2017.
 */

public class Categoria {

    private String categoria;
    private String nombreP;
    private String nombreS;
    private String nombreT;
    private int imgP;
    private int imgS;
    private int imgT;

    public Categoria(String categoria, String nombreP, String nombreS, String nombreT, int imgP, int imgS, int imgT) {
        this.categoria = categoria;
        this.nombreP = nombreP;
        this.nombreS = nombreS;
        this.nombreT = nombreT;
        this.imgP = imgP;
        this.imgS = imgS;
        this.imgT = imgT;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public int getImgP() {
        return imgP;
    }

    public void setImgP(int imgP) {
        this.imgP = imgP;
    }

    public int getImgS() {
        return imgS;
    }

    public void setImgS(int imgS) {
        this.imgS = imgS;
    }

    public int getImgT() {
        return imgT;
    }

    public void setImgT(int imgT) {
        this.imgT = imgT;
    }
}
