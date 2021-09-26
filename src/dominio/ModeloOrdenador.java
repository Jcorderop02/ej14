package dominio;

public class ModeloOrdenador {

    private String identificadorDeModelo;
    private String marca;
    private String modeloDeProcesador;
    private int memoriaRam;
    private int discoDuro;

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
        return "\nModelo de Ordenador:" + "\n-Identificador de modelo: " +
                identificadorDeModelo + "\n-Marca: " + marca +
                "\n-Modelo Del Procesador: " + modeloDeProcesador+
                "\n-Disco Duro: " + discoDuro + "TB NVME" + "\n-Memoria Ram: " +
                memoriaRam + "GB DDR4";
    }
}
