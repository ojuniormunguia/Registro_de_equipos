import java.util.ArrayList;
public class ClaseLaptop extends ClaseBase {
    private Double tamañoPantalla;
    private ArrayList<String> laptopInfo = new ArrayList<String>();
    public ClaseLaptop(String fabricante, String modelo, String microprocesador, int memoria, int discoDuro, Double tamañoPantalla) {
        super(fabricante, modelo, microprocesador, memoria, discoDuro);
        this.tamañoPantalla = tamañoPantalla;
    }
    //geter y seters tamaño pantalla
    public Double getTamañoPantalla() {
        return tamañoPantalla;
    }
    public void setTamañoPantalla(Double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
    //geter y seters laptopInfo
    public ArrayList<String> getLaptopInfo() {
        return laptopInfo;
    }
    public void setLaptopInfo(ArrayList<String> laptopInfo) {
        this.laptopInfo = laptopInfo;
    }

}
