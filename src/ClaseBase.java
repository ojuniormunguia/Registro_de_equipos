import java.util.ArrayList;

public class ClaseBase {
    private String fabricante;
    private String modelo;
    private String microprocesador;
    private int memoria;
    private int discoDuro;
    private ArrayList<String> equipos = new ArrayList<String>();

    //constructor de clase base
    public ClaseBase(String fabricante, String modelo, String microprocesador, int memoria, int discoDuro) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
    }
    //geter y seters fabricante
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    //geter y seters modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //geter y seters microprocesador
    public String getMicroprocesador() {
        return microprocesador;
    }
    public void setMicroprocesador(String microprocesador) {
        this.microprocesador = microprocesador;
    }
    //geter y seters memoria
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    //geter y seters disco duro
    public int getDiscoDuro() {
        return discoDuro;
    }
    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    //geter y seters baseInfo
    public ArrayList<String> getBaseInfo() {
        return equipos;
    }
    public void setBaseInfo(ArrayList<String> baseInfo) {
        this.equipos = baseInfo;
    }

}
