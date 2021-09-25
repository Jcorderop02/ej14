package dominio;

public class OfertaOrdenador {

    private int precioInicial;
    private int descuento;

    public int getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(int precioInicial) {
        this.precioInicial = precioInicial;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int calcularPrecioFinal() {
        return precioInicial - descuento;
    }

}
