package dominio;

public class OfertaOrdenador {

    private int precioInicial;
    private int descuento;
    private ModeloOrdenador tieneOrdenadorOfertado;

    public void setNuevoModelo(ModeloOrdenador nuevoModelo){
        tieneOrdenadorOfertado = nuevoModelo;
    }

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

    public String toString() {
        return tieneOrdenadorOfertado + "\n" + "\nOfertaOrdenador: " +
                "\n-Precio Inicial: " + precioInicial +"€" +
                "\n-Descuento: " + descuento +"€" + "\n-Precio final: " + calcularPrecioFinal() +"€";
    }
}
