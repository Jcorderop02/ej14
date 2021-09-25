package dominio;

public class ModeloOrdenador {

    private String identificadorDeModelo;
    private String marca;
    private String modeloDeProcesador;
    private int memoriaRam;
    private int discoDuro;
    private OfertaOrdenador tieneOrdenadorOfertado;

    public String getIdentificadorDeModelo() {
        return identificadorDeModelo;
    }

    public void setIdentificadorDeModelo(String identificadorDeModelo) {
        this.identificadorDeModelo = identificadorDeModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModeloDeProcesador() {
        return modeloDeProcesador;
    }

    public void setModeloDeProcesador(String modeloDeProcesador) {
        this.modeloDeProcesador = modeloDeProcesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String toString(){
        return "Identificador de modelo: " + identificadorDeModelo + "\nMarca: " + marca + "\nModelo Del Procesador: " + modeloDeProcesador+ "\nDisco Duro: " + discoDuro + "TB" + "\nMemoria Ram: " + memoriaRam + "GB";
    }
}
