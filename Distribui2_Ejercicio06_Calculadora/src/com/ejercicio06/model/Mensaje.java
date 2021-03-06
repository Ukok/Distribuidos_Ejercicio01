package com.ejercicio06.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Mensaje implements Serializable {

    private int codigoOperacion;

    /**
     * Constructor
     *
     * @param codigoOperacion Código de operación del mensaje.
     */
    public Mensaje() { }
    /**
     * Constructor
     *
     * @param codigoOperacion Código de operación del mensaje.
     */
    public Mensaje(int codigoOperacion) {
        this.codigoOperacion = codigoOperacion;
    }

    /**
     * Obtiene código de operación.
     *
     * @return Código de operación.
     */
    public int getCodigoOperacion() {
        return codigoOperacion;
    }

    /**
     * Establece un código de operacion.
     *
     * @param codigoOperacion codigo de operacion de mensaje.
     */
    public void setCodigoOperacion(int codigoOperacion) {
        this.codigoOperacion = codigoOperacion;
    }

    /**
     * Convierte éste objeto en un arreglo de bytes.
     *
     * @return Arreglo de bytes de Mensaje.
     */
    public byte[] toByteArrray() {
        ObjectOutputStream oos = null;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        try {
            oos = new ObjectOutputStream(buf);
            oos.writeObject(this);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return buf.toByteArray();
    }

    /**
     * Intenta convertir un arreglo de bytes en un Mensaje.
     *
     * @param buf Arreglo de bytes.
     * @return Mensaje obtenido por el arreglo de bytes.
     */
    public static Mensaje fromByteArray(byte[] buf) {
        try {
            ObjectInputStream ois = null;
            ByteArrayInputStream bis = new ByteArrayInputStream(buf);
            ois = new ObjectInputStream(bis);
            Mensaje aux = (Mensaje) ois.readObject();
            ois.close();
            return aux;
        } catch (IOException ex) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
