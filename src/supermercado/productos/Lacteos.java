package supermercado.productos;

public class Lacteos extends Frescos{
    private Grasa grasa;

    public Lacteos(String nombre, double precio, double descuento, Grasa grasa) {
        super(nombre, precio, descuento);
        this.grasa = grasa;
    }
    public String infoProducto() {
        return (super.infoProducto() + "\nNivel de grasa:\t" + grasa);
    }

    public Grasa getGrasa() {
        return grasa;
    }

    public void setGrasa(Grasa grasa) {
        this.grasa = grasa;
    }
}
