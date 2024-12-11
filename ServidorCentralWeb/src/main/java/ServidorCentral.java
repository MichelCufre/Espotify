import presentacionGUI.Principal;
import controladores.Fabrica;
import controladores.iSistema;
import excepciones.UsuarioRepetidoException;
import persistencia.ControladorPersistencia;
import persistencia.iControladorPersistencia;


public class ServidorCentral {
    ControladorPersistencia cpu;
    iSistema sys = new Fabrica().getSistema(cpu);
    public static void main(String[] args) throws UsuarioRepetidoException {
        Fabrica f = new Fabrica();
        
        //iControladorPersistencia cpu = f.getControladorPersistencia();
        
        
        new Thread(() -> {
            try {
                // Abre la ventana Swing de la aplicación
                Principal programa = new Principal();
                programa.setVisible(true);
                programa.setLocationRelativeTo(null);
                System.out.println("Ventana Swing iniciada.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        
//        Principal programa = new Principal();
//        programa.setVisible(true);
//        programa.setLocationRelativeTo(null);
        
    }

}
