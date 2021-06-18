/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Gerardo Lagos
 */
public class GestionVehiculos {

    public static ArrayList<vehiculos> listavehiculos = new ArrayList<>();

    public static void agregarVehiculo(vehiculos unVehiculos) {
        listavehiculos.add(unVehiculos);
    }

    public static boolean existelistavehiculos(String Id2) {
        boolean existe = false;
        for (int i = 0; i < listavehiculos.size(); i++) {
            if (listavehiculos.get(i).getVin().equals(Id2)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static void actualizarvehiculos(vehiculos unDocente) {
        int posicion = 0;
        String vin = unDocente.getVin();
        for (int i = 0; i < listavehiculos.size(); i++) {
            if (listavehiculos.get(i).getVin().equals(vin)) {
                posicion = i;
                break;
            }
        }
        listavehiculos.set(posicion, unDocente);
    }

}
