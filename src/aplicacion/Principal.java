package aplicacion;

import dominio.ModeloOrdenador;
import dominio.OfertaOrdenador;

public class Principal {

    public static void main(String[] args){

        ModeloOrdenador modeloOrdenador = new ModeloOrdenador();
         modeloOrdenador.setIdentificadorDeModelo("MYD83xx/A");
         modeloOrdenador.setMarca("Asus");
         modeloOrdenador.setDiscoDuro(3);
         modeloOrdenador.setMemoriaRam(16);
         modeloOrdenador.setModeloDeProcesador("Ryzen 9");

        OfertaOrdenador ofertaOrdenador = new OfertaOrdenador();
        ofertaOrdenador.setPrecioInicial(900);
        ofertaOrdenador.setDescuento(300);
        ofertaOrdenador.calcularPrecioFinal();

        System.out.println(modeloOrdenador);
    }
}
