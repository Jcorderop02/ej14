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
        modeloOrdenador.setModeloDeProcesador("Ryzen 9 5950X");

        OfertaOrdenador ofertaOrdenador = new OfertaOrdenador();
        ofertaOrdenador.setPrecioInicial(2000);
        ofertaOrdenador.setDescuento(300);
        ofertaOrdenador.calcularPrecioFinal();
        ofertaOrdenador.setNuevoModelo(modeloOrdenador);

        System.out.println(ofertaOrdenador);

        ModeloOrdenador modeloOrdenador1 = new ModeloOrdenador();
        modeloOrdenador1.setIdentificadorDeModelo("SJAHSA/A");
        modeloOrdenador1.setMarca("Apple");
        modeloOrdenador1.setDiscoDuro(3);
        modeloOrdenador1.setMemoriaRam(16);
        modeloOrdenador1.setModeloDeProcesador("Intel i9 ");

        OfertaOrdenador ofertaOrdenador1 = new OfertaOrdenador();
        ofertaOrdenador1.setPrecioInicial(4000);
        ofertaOrdenador1.setDescuento(1100);
        ofertaOrdenador1.calcularPrecioFinal();
        ofertaOrdenador1.setNuevoModelo(modeloOrdenador1);

        System.out.println(ofertaOrdenador1);
    }
}
