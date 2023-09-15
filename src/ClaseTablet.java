import java.util.ArrayList;
public class ClaseTablet extends ClaseBase{
    private Double tamañoTablet;
    private String capacitiva;
    private String OS;
    private ArrayList<String> tabletInfo = new ArrayList<String>();
    public ClaseTablet(String fabricante, String modelo, String microprocesador, int memoria, int discoDuro, Double tamañoTablet, String capacitiva, String OS) {
        super(fabricante, modelo, microprocesador, memoria, discoDuro);
        this.tamañoTablet = tamañoTablet;
        this.capacitiva = capacitiva;
        this.OS = OS;
    }
    //geter y seters tamaño pantalla
    public Double gettamañoTablet() {
        return tamañoTablet;
    }
    public void settamañoTablet(Double tamañoTablet) {
        this.tamañoTablet = tamañoTablet;
    }
    //geter y seters capacitiva
    public String getcapacitiva() {
        return capacitiva;
    }
    public void setcapacitiva(String capacitiva) {
        this.capacitiva = capacitiva;
    }
    //geter y seters OS
    public String getOS() {
        return OS;
    }
    public void setOS(String OS) {
        this.OS = OS;
    }
    //geter y seters tabletInfo
    public ArrayList<String> getTabletInfo() {
        return tabletInfo;
    }
    public void setTabletInfo(ArrayList<String> tabletInfo) {
        this.tabletInfo = tabletInfo;
    }
}
