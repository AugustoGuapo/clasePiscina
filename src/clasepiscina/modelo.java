/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepiscina;

/**
 *
 * @author user
 */
public class modelo {
    private final int BULTO_ARENA = 3000;
    private final int BULTO_GRAVILLA = 5000;
    private final int BULTO_CEMENTO = 20000;
    private final int MANO_OBRA_CEMENTO = 10000;
    private final int M2_BALDOSA = 10000;
    private final int BOLSA_PEGANTE= 7500;
    private final int MANO_OBRA_BALDOSA = 15000;
    private final int M3_AGUA = 15000;
    private final int LITRO_QUIMICOS = 17000;
    private float largo;
    private float ancho;
    private float profundidad;

    

    /**
     * @return the largo
     */
    public float getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(float largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public float getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the profundidad
     */
    public float getProfundidad() {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    public float areaParedesAncho() {
        return ancho*profundidad*2;
    }
    
    public float areaParedesLargo() {
        return largo*profundidad*2;
    }
    
    public float areaPiso() {
        return ancho*largo;
    }
    
    public float totalAreaBaldosa() {
        return areaParedesAncho() + areaParedesLargo() + areaPiso();
    }
    
    public float costoBaldosa() {
        return totalAreaBaldosa() 
                * (M2_BALDOSA + (BOLSA_PEGANTE*3) + MANO_OBRA_BALDOSA);
    }
    public float volumenParedesAncho() {
        return (float) ((areaParedesAncho())*0.1)*2;
    }
    
    public float volumenParedesLargo() {
        return (float) ((areaParedesLargo())*0.1)*2;
    }
    
    public float volumenPiso() {
        return (float) ((areaPiso())*0.25);
    }
    
    public float totalVolumenCemento() {
        return volumenParedesAncho() + volumenParedesLargo() + volumenPiso();
    }
    
    public float costoCemento() {
        return totalVolumenCemento() 
                * (BULTO_ARENA*2 + BULTO_GRAVILLA*3 + BULTO_CEMENTO + MANO_OBRA_CEMENTO);
    }
    
    public float volumenTotalPiscina() {
        return largo*ancho*profundidad;
    }
    
    public float costoAgua() {
        return volumenTotalPiscina() *
                (M3_AGUA + LITRO_QUIMICOS);
    }
    
    public float costoTotalObra () {
            return costoBaldosa() + costoCemento() + costoAgua();
            }
}
