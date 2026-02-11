package supermercado.productos;

public class Lacteos extends Frescos{
    private Grasa grasa;

    public Lacteos(String nombre, double precio, double descuento, Grasa grasa) {
        super(nombre, precio, descuento);
        this.grasa = grasa;
    }
}
