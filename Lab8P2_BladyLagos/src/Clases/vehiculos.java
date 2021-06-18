/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gerardo Lagos
 */
public class vehiculos {

    private String vin;//Vehicle Identification Number
    private String marca;//a la que pertenece
    private String carroceria;//(sedán, familiar, hatchback, fastback o SUV)
    private String numpuertas;
    private String motor;//(a combustión o eléctrico)
    private String precio;//euros
    private String hibridacion;//(ninguna, microhíbrido, híbrido convencional, híbrido enchufable o eléctrico)
    private String cantpasajeros;//cantidad máxima de pasajeros
    private String ensamblaje;//(en segundos)

    public vehiculos() {
    }

    
    public vehiculos(String vin, String marca, String carroceria, String numpuertas, String motor, String precio, String hibridacion, String cantpasajeros, String ensamblaje) {
        this.vin = vin;
        this.marca = marca;
        this.carroceria = carroceria;
        this.numpuertas = numpuertas;
        this.motor = motor;
        this.precio = precio;
        this.hibridacion = hibridacion;
        this.cantpasajeros = cantpasajeros;
        this.ensamblaje = ensamblaje;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(String numpuertas) {
        this.numpuertas = numpuertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getHibridacion() {
        return hibridacion;
    }

    public void setHibridacion(String hibridacion) {
        this.hibridacion = hibridacion;
    }

    public String getCantpasajeros() {
        return cantpasajeros;
    }

    public void setCantpasajeros(String cantpasajeros) {
        this.cantpasajeros = cantpasajeros;
    }

    public String getEnsamblaje() {
        return ensamblaje;
    }

    public void setEnsamblaje(String ensamblaje) {
        this.ensamblaje = ensamblaje;
    }

    @Override
    public String toString() {
        return "Vehiculos= " + "vin=" + vin + ", marca=" + marca + ", carroceria=" + carroceria + ", numpuertas=" + numpuertas + ", motor=" + motor + ", precio=" + precio + ", hibridacion=" + hibridacion + ", cantpasajeros=" + cantpasajeros + ", ensamblaje=" + ensamblaje;
    }

    
    
}
