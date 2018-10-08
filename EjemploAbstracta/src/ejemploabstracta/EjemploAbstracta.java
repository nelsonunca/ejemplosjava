package ejemploabstracta;

public class EjemploAbstracta {
    public static void main(String[] args) {
        Producto [] prodArray = new Producto[3];;
        Perecedero vperecedero = new Perecedero("0001","Queso",20.0,"06/2015");
        NoPerecedero vnoperecedero = new NoPerecedero("1000","Azucar",5.0,"Nacional");
        Perecedero vperecedero1 = new Perecedero("0002","Leche",8.0,"36/09/2012");
        
        vperecedero.imprimirDescipcion();
        vnoperecedero.imprimirDescipcion();
        
        prodArray[0] = vperecedero;
        prodArray[1] = vnoperecedero;
        prodArray[2] = vperecedero1;
      
        for (int i = 0; i < prodArray.length ; i++) {
            Producto e = prodArray[i];
            double imp = (double) e.devolverImpuesto();
            System.out.println(e.getDenominacion() +"Impuesto: "+imp);
            
            if (e instanceof Perecedero) {
                Perecedero per = (Perecedero)e;
                per.imprimirDescipcion();
//                System.out.println("Fecha de Vto:"+per.getFechaVto());
            }
            if (e instanceof NoPerecedero) {
                NoPerecedero per = (NoPerecedero)e;
                per.imprimirDescipcion();
// System.out.println("Descripcion Exportado:" + per.getCodigo() + "  --  " +    per.getDenominacion() + "  --  " + per.getOrigen());
             //   System.out.println("Origen:"+per.getOrigen());
            }
            
        }
    }
}
