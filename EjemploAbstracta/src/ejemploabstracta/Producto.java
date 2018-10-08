package ejemploabstracta;

public abstract class Producto implements Impuesto {
//public abstract class Producto  {
    private String codigo;
    private String denominacion;
    private double precio;

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   Producto(String codigo,String denominacion,double precio){
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.precio = precio;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public abstract void imprimirDescipcion();    
}
