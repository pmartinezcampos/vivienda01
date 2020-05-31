
package Hogar;
/**
 * 
 * @author pedro
 * @version  1.0
 * 
 */

public class Vivienda 
{

    private double precio;
    private  int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * 
     * @param precio   Precio de la vivienda
     * @param numHabitaciones Numero de Habitaciones
     * @param superficie Superficio 
     * @param parking Tiene Parking
     * @param estado En que estado esta 
     * @param propietario  Quien es el propieario
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }

     
    public double getPrecio() {
        return precio;
    }
    /**
     * 
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * 
     * @param numHabitaciones 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }
    /**
     * 
     * @param superficie 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isParking() {
        return parking;
    }
    /**
     * 
     * @param parking 
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getEstado() {
        return estado;
    }
    /**
     * 
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }
    /**
     * 
     * @param propietario 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * 
     * @param descuento 
     */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * (descuento/100);
    }
    
    
    
}
