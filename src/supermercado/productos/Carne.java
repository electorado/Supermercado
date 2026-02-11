package supermercado.productos;

public class Carne extends Frescos{
    private TipoCarne tipoCarne;

    public Carne(String nombre, double precio, double descuento, TipoCarne tipoCarne) {
        super(nombre, precio, descuento);
        this.tipoCarne = tipoCarne;
    }
}
