package logica;

import controladores.Fabrica;
import controladores.Sistema;
import controladores.iSistema;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import persistencia.ControladorPersistencia;

public class EmailService {
 

    private static final String FROM_EMAIL = "noreply@espotify.com";

    public static void enviarNotificacion(Subscripcion sub) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.host", "localhost");
        props.put("mail.smtp.port", "1025");  // Puerto por defecto de Mailhog
        props.put("mail.smtp.auth", "false");
        props.put("mail.smtp.starttls.enable", "false");

        // Obtener el nickname del cliente desde la subscripción
        String nicknameCliente = sub.getNickname();
        
        ControladorPersistencia cpu = new ControladorPersistencia(); // o pasa el controlador que estés usando
        iSistema sys = Sistema.getInstance(cpu);
        
        // Obtener el Cliente por su nickname
        Cliente cliente;
        cliente = sys.ObtenerCliente(nicknameCliente);
        
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no encontrado");
        }

        // Crear la sesión y mensaje para enviar el correo
        Session session = Session.getInstance(props);
        Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(FROM_EMAIL));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(cliente.getEmail())); // Usar el correo del Cliente

        // Formato del asunto: [Espotify] [fecha-hora]
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String asunto = String.format("[Espotify] [%s]",
                LocalDateTime.now().format(formatter));
        message.setSubject(asunto);

        // Crear el contenido HTML del mensaje
        String contenido = String.format(
                "<html>" +
                        "<body>" +
                        "<p>Estimada/o %s. Su suscripción en Espotify ha sido aprobada y se encuentra Vigente.</p>" +
                        "<p>---Detalles de la Suscripción</p>" +
                        "<p>-Tipo:</p>" +
                        "<p>-%s: U$$:%s</p>" +
                        "<p>- Fecha inicio:</p>" +
                        "<p>- %s</p>" +
                        "<p>- Fecha fin:</p>" +
                        "<p>- %s</p>" +
                        "<p>Gracias por preferirnos,<br>" +
                        "Saludos.<br>" +
                        "Espotify</p>" +
                        "</body>" +
                        "</html>",
                cliente.getNombre(),  // Usar el nombre del cliente
                sub.getTipo(),
                obtenerPrecio(sub.getTipo()),
                sub.getInicio().atStartOfDay().format(formatter),
                sub.getFin().atStartOfDay().format(formatter)
        );

        message.setContent(contenido, "text/html; charset=utf-8");
        Transport.send(message);
    }

    private static String obtenerPrecio(String tipo) {
        switch (tipo) {
            case "Mensual":
                return "2";
            case "Semanal":
                return "1";
            case "Anual":
                return "20";
            default:
                return "0";
        }
    }
}