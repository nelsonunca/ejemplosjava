package ejemploabstracta;

public class NoPerecedero extends Producto {

    private String origen;

    NoPerecedero(String codigo, String denominacion, double precio, String origen) {
        super(codigo, denominacion, precio);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public void imprimirDescipcion() {
        System.out.println("Descripcion No Perecedero:" + getCodigo() + "   -  " + getOrigen());
    }

    @Override
    public double devolverImpuesto() {
        return getPrecio() * 1.21;
    }
}
