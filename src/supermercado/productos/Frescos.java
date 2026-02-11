package supermercado.productos;
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
                "Nombre:\t" + nombre + "\n" +
                "Precio:\t" + precio + "\n" +
                "Descuento:\t" + descuento + " %"
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
        Frescos pollo = new Frescos("pechuga de pollo", 5.60, 5);
        carrito.add(pollo);
        System.out.println(pollo.infoProducto());
    }

}
