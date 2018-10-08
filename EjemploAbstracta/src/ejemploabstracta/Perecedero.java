package ejemploabstracta;

public class Perecedero extends Producto {

    private String fechaVto;

    Perecedero(String codigo, String denominacion, double precio, String fechaVto) {
        super(codigo, denominacion, precio);
        this.fechaVto = fechaVto;
    }

    public String getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(String fechaVto) {
        this.fechaVto = fechaVto;
    }

    @Override
    public void imprimirDescipcion() {
        System.out.println("Descripcion Perecedero:" + getCodigo() + "  --  " + getDenominacion() + "  --  " + fechaVto);
    }

   @Override
    public double devolverImpuesto() {
        return getPrecio() * 1.105;
    }

    
}
