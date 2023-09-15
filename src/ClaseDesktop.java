import java.util.ArrayList;
public class ClaseDesktop extends ClaseBase {
    private String tamañoTorre;
    private String GPU;
    private ArrayList<String> desktopInfo = new ArrayList<String>();
    public ClaseDesktop(String fabricante, String modelo, String microprocesador, int memoria, int discoDuro, String tamañoTorre, String GPU) {
        super(fabricante, modelo, microprocesador, memoria, discoDuro);
        this.tamañoTorre = tamañoTorre;
        this.GPU = GPU;
    }
    //geter y seters tamaño torre
    public String getTamañoTorre() {
        return tamañoTorre;
    }
    public void setTamañoTorre(String tamañoTorre) {
        this.tamañoTorre = tamañoTorre;
    }
    //geter y seters GPU
    public String getGPU() {
        return GPU;
    }
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
    //geter y seters desktopInfo
    public ArrayList<String> getDesktopInfo() {
        return desktopInfo;
    }
    public void setDesktopInfo(ArrayList<String> desktopInfo) {
        this.desktopInfo = desktopInfo;
    }
}
