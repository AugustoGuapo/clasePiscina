/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasepiscina;

/**
 *
 * @author user
 */
public class ClasePiscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vista ventana = new vista();
        ventana.setVisible(true);
        modelo obj = new modelo();
        System.out.println(obj.totalAreaBaldosa());
    }
    
}
