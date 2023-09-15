import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ClaseBase> equipos = new ArrayList<ClaseBase>();
        while (true){
            String[] opciones = {"Crear", "Mostrar", "Salir"};
            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opcion",
                    "Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);
            switch (opcion) {
                case 0:
                    agregarEquipo(equipos);
                    break;

                case 1:
                    verEquipo(equipos);
                    break;

                case 2:
                    System.exit(0);
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }

    }
    private static void agregarEquipo(ArrayList<ClaseBase> equipos) {
        String[] opciones = {"Tablet", "Laptop", "Desktop", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);
        switch (opcion) {
            case 0:
                //agregar Tablet a la lista
                String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante");
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo");
                String microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador");
                int memoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la memoria NAND"));
                Double tamañoTablet = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño diagonal de la pantalla"));
                String capacativa = JOptionPane.showInputDialog("Ingrese si es capacativa o resistiva");
                String OS = JOptionPane.showInputDialog("Ingrese el sistema operativo");

                ClaseTablet tablet = new ClaseTablet(fabricante, modelo, microprocesador, memoria, 0, tamañoTablet, capacativa, OS);
                tablet.getTabletInfo().add("Fabricante: " + tablet.getFabricante());
                tablet.getTabletInfo().add("Modelo: " + tablet.getModelo());
                tablet.getTabletInfo().add("Microprocesador: " + tablet.getMicroprocesador());
                tablet.getTabletInfo().add("Memoria: " + tablet.getMemoria());
                tablet.getTabletInfo().add("Tamaño de pantalla: " + tablet.gettamañoTablet());
                tablet.getTabletInfo().add("Capacativa: " + tablet.getcapacitiva());
                tablet.getTabletInfo().add("Sistema operativo: " + tablet.getOS());
                equipos.add(tablet);

                break;

            case 1:
                //agregar Laptop a la lista
                fabricante = JOptionPane.showInputDialog("Ingrese el fabricante");
                modelo = JOptionPane.showInputDialog("Ingrese el modelo");
                microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador");
                memoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la memoria RAM"));
                double tamañoPantalla = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño diagonal de la pantalla"));
                int discoDuro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la memoria HDD"));

                ClaseLaptop laptop = new ClaseLaptop(fabricante, modelo, microprocesador, memoria, discoDuro, tamañoPantalla);
                laptop.getLaptopInfo().add("Fabricante: " + laptop.getFabricante());
                laptop.getLaptopInfo().add("Modelo: " + laptop.getModelo());
                laptop.getLaptopInfo().add("Microprocesador: " + laptop.getMicroprocesador());
                laptop.getLaptopInfo().add("Memoria: " + laptop.getMemoria());
                laptop.getLaptopInfo().add("Tamaño de pantalla: " + laptop.getTamañoPantalla());
                laptop.getLaptopInfo().add("Tipo de disco: " + laptop.getDiscoDuro());
                equipos.add(laptop);

                break;

            case 2:
                //agregar Desktop a la lista
                fabricante = JOptionPane.showInputDialog("Ingrese el fabricante");
                modelo = JOptionPane.showInputDialog("Ingrese el modelo");
                microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador");
                memoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la memoria RAM"));
                String GPU = JOptionPane.showInputDialog("Ingrese la GPU");
                String tamañoTorre = JOptionPane.showInputDialog("Ingrese el tamaño de la torre");
                discoDuro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la memoria HDD"));

                ClaseDesktop desktop = new ClaseDesktop(fabricante, modelo, microprocesador, memoria, discoDuro, tamañoTorre, GPU);
                desktop.getDesktopInfo().add("Fabricante: " + desktop.getFabricante());
                desktop.getDesktopInfo().add("Modelo: " + desktop.getModelo());
                desktop.getDesktopInfo().add("Microprocesador: " + desktop.getMicroprocesador());
                desktop.getDesktopInfo().add("Memoria: " + desktop.getMemoria());
                desktop.getDesktopInfo().add("Tipo de disco: " + desktop.getDiscoDuro());
                desktop.getDesktopInfo().add("Tamaño de la torre: " + desktop.getTamañoTorre());
                desktop.getDesktopInfo().add("GPU: " + desktop.getGPU());
                equipos.add(desktop);

                break;

            case 3:
                break;

            default:
                System.exit(0);
                break;
        }
    }
    private static void verEquipo(ArrayList<ClaseBase> equipos) {
        if (equipos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay equipos para mostrar.");
            return;
        }
        String[] opciones = {"Tablet", "Laptop", "Desktop", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);
        switch (opcion) {
            case 0:
                //mostrar info dentro de la lista de ClaseTablet como una cadena
                String tabletInfo = "";
                for (ClaseBase equipo : equipos) {
                    if (equipo instanceof ClaseTablet) {
                        tabletInfo += ((ClaseTablet) equipo).getTabletInfo() + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, tabletInfo);

                break;
            case 1:
                //mostrar info dentro de la lista de ClaseLaptop como una cadena
                String laptopInfo = "";
                for (ClaseBase equipo : equipos) {
                    if (equipo instanceof ClaseLaptop) {
                        laptopInfo += ((ClaseLaptop) equipo).getLaptopInfo() + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, laptopInfo);

                break;
            case 2:
                //mostrar info dentro de la lista de ClaseDesktop como una cadena
                String desktopInfo = "";
                for (ClaseBase equipo : equipos) {
                    if (equipo instanceof ClaseDesktop) {
                        desktopInfo += ((ClaseDesktop) equipo).getDesktopInfo() + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, desktopInfo);
                break;
            case 3:
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
