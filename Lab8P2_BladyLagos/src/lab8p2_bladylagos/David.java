/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_bladylagos;

import Clases.vehiculos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerardo Lagos
 */
public class David {

    private String nombre;
    private ArrayList<vehiculos> lista = new ArrayList();

    public David(String nombre) {
        this.nombre = nombre;
    }

    public David() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<vehiculos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<vehiculos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void setVehiculos(vehiculos p) {
        this.lista.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (vehiculos t : lista) {
                bw.write(t.getVin() + "/");
                bw.write(t.getMarca() + "/");
                bw.write(t.getCarroceria() + "/");
                bw.write(t.getNumpuertas() + "/");
                bw.write(t.getMotor() + "/");
                bw.write(t.getPrecio() + "/");
                bw.write(t.getHibridacion() + "/");
                bw.write(t.getCantpasajeros() + "/");
                bw.write(t.getEnsamblaje() + "/");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        File archivo = new File("./" + getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista.add(new vehiculos(sc.next(),
                            sc.next(), sc.next(),
                            sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
