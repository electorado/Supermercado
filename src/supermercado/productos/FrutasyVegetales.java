package supermercado.productos;

public class FrutasyVegetales extends Frescos{
    private TipoCultivo tipoCultivo;

    public FrutasyVegetales(String nombre, double precio, double descuento, TipoCultivo tipoCultivo) {
        super(nombre, precio, descuento);
        this.tipoCultivo = tipoCultivo;
    }
}
