
import controladores.Fabrica;
import controladores.iSistema;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import javax.swing.SwingUtilities;
import persistencia.ControladorPersistencia;
import presentacionGUI.Principal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/ServletListener.java to edit this template
 */

/**
 * Web application lifecycle listener.
 *
 * @author dokgo
 */
public class MyAppListener implements ServletContextListener {


//    private static boolean guiInitialized = false;
//
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        // Lógica de inicialización del backend de la web primero
//        ControladorPersistencia cpu = new ControladorPersistencia();
//        iSistema sys = new Fabrica().getSistema(cpu);
//        System.out.println("Backend inicializado.");
//        
//        // Verificar soporte para GUI
//        if (Principal.isGuiSupported()) {
//            new Thread(() -> {
//                try {
//                    Thread.sleep(2000); // Retraso
//                    
//                    SwingUtilities.invokeLater(() -> {
//                        Principal programa = new Principal();
//                        programa.setVisible(true);
//                        programa.setLocationRelativeTo(null);
//                    });
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        } else {
//            System.out.println("Entorno no soporta GUI");
//        }
//    }
    
    private static Principal guiInstance = null;

@Override
public void contextInitialized(ServletContextEvent sce) {
    // Lógica de inicialización del backend de la web primero
    ControladorPersistencia cpu = new ControladorPersistencia();
    iSistema sys = new Fabrica().getSistema(cpu);
    System.out.println("Backend inicializado.");
    
    // Verificar soporte para GUI
    if (Principal.isGuiSupported()) {
        new Thread(() -> {
            try {
                // Asegurarse de que el backend esté listo antes de iniciar la GUI
                Thread.sleep(2000); 

                SwingUtilities.invokeLater(() -> {
                    try {
                        // Si ya existe una instancia de la GUI, ciérrala
                        if (guiInstance != null && guiInstance.isVisible()) {
                            guiInstance.dispose(); // Cierra la instancia anterior
                        }

                        // Crear y mostrar la nueva instancia de la GUI
                        guiInstance = new Principal();
                        guiInstance.setVisible(true);
                        guiInstance.setLocationRelativeTo(null); // Centrar la ventana
                        System.out.println("GUI lanzada correctamente.");
                    } catch (Exception e) {
                        // Manejar cualquier excepción en el hilo de la GUI
                        e.printStackTrace();
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    } else {
        System.out.println("Entorno no soporta GUI");
    }
}




    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
