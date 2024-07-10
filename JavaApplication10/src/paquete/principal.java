
package paquete;

import javax.swing.JOptionPane;


public class principal {
    public static void main(String[] args) {
        int op=0;
        int cantmonitores=0;
        int cantgabinetes=0;
        int cantram=0;
        double montotvent=0;
        String rutcomprador;
        producto monitor =new producto("Monitor",40,99000);
        producto gabinete =new producto ("Gabinete",30,45000);
        producto ram =new producto ("Ram",80,25000);
        do {            
            
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              --------MENÚ--------
                                                               1.Crear venta
                                                               2.Consultar stock de producto
                                                               3.Consultar boleta por rut
                                                               4.Total dinero recaudado
                                                               5.Salir
                                                                      """));

            
            switch (op) {
            case 1:
                do {                    
                    op= Integer.parseInt(JOptionPane.showInputDialog("""
                                                              --------MENÚ DE VENTA--------
                                                               1.MONITORES
                                                               2.GABINETES
                                                               3.RAM
                                                               4.FINALIZAR COMPRA
                                                               5.VOLVER A MENU PRINCIPAL
                                                               INGRESE OPCION A COMPRAR

                                                                      """));
                    switch (op) {
                        case 1:
                            cantmonitores = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                         Ingrese cantidad de monitores a llevar
                                                                                         """));
                            break;
                        case 2: 
                            cantgabinetes = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                         Ingrese cantidad de gabinetes a llevar
                                                                                         """));
                            break;
                        case 3:
                            cantram = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                         Ingrese cantidad de ram a llevar
                                                                                         """));
                            break;
                        case 4:
                            montotvent=cantmonitores * monitor.getPrecioventa() + cantgabinetes * gabinete.getPrecioventa() + cantram * ram.getPrecioventa();
                            JOptionPane.showMessageDialog(null, "Monto total de la compra:" + montotvent);
                             rutcomprador = JOptionPane.showInputDialog("Ingrese rut de comprador:");
                            break;
                        case 5:
                            
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            
                    }
                } while (op!=5);
                
                
                
                
                break;
            case 2:
                break;
            case 3: 
                break;
            case 4: 
                break;
            case 5:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
        } while (true);
        
    }
}
