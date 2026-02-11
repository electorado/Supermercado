package supermercado.productos;
import java.security.spec.ECField;
import java.util.ArrayList;

public class Frescos {
    private String nombre;
    private double precio;
    private double descuento;

    public Frescos(String nombre, double precio, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public double getPrecioFinal(){
        return precio - (precio*descuento/100);
    }

    public String infoProducto(){
        return (
                "Nombre:\t\t" + nombre + "\n" +
                "Precio:\t\t" + precio + "€\n" +
                "Descuento:\t" + descuento + "%"
                );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static void main(String[] args) {
        ArrayList<Frescos> carrito = new ArrayList<Frescos>();
        Frescos pan = new Frescos("Hogaza integral", 3.60, 5);
        carrito.add(pan);
        System.out.println(pan.infoProducto());
        System.out.println("Precio final:\t" + pan.getPrecioFinal() + "€");

        Carne pollo = new Carne("pechuga de pollo", 7.89, 2.5, TipoCarne.ECO );
        carrito.add(pollo);
        System.out.println(pollo.infoProducto());
        System.out.println("Precio final:\t" + pollo.getPrecioFinal() + "€");

        FrutasyVegetales repollo = new FrutasyVegetales("Col rizada", 2.79, 0, TipoCultivo.KM_0);
        carrito.add(pollo);
        System.out.println(repollo.infoProducto());
        System.out.println("Precio final:\t" + repollo.getPrecioFinal() + "€");

        Lacteos yogurth = new Lacteos("pechuga de pollo", 4.25, 5, Grasa.ENTERO);
        carrito.add(yogurth);
        System.out.println(yogurth.infoProducto());
        System.out.println("Precio final:\t" + yogurth.getPrecioFinal() + "€");

        double total = 0;

        for (int i = 0; i < carrito.size(); i++ ) {
            total += carrito.get(i).getPrecioFinal();
        }

        System.out.println("Total a pagar:\t" + total +"€");

    }

}
