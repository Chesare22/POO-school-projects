package test;

import controlador.ControlCliente;
import modelo.Cliente;
import vista.VistaCliente;

/**
 * @author lbojor
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente modeloCliente = new Cliente();
        VistaCliente vistaCliente = new VistaCliente();
        new ControlCliente(modeloCliente, vistaCliente);
        vistaCliente.setVisible(true);
    }

}
