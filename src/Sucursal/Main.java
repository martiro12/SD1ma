/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucursal;

import java.rmi.AlreadyBoundException;

/**
 *
 * @author Aileen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AlreadyBoundException {
         RemServer.CrearServidor();
         RemClient.CrearClientes();
    }
    
}