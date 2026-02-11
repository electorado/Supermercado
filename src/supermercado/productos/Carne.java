package supermercado.productos;

public class Carne extends Frescos{
    private TipoCarne tipoCarne;

    public Carne(String nombre, double precio, double descuento, TipoCarne tipoCarne) {
        super(nombre, precio, descuento);
        this.tipoCarne = tipoCarne;
    }
    public String infoProducto() {
        return (super.infoProducto() + "\nTipo de Carne:\t" + tipoCarne);
    }

    public TipoCarne getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(TipoCarne tipoCarne) {
        this.tipoCarne = tipoCarne;
    }


}

