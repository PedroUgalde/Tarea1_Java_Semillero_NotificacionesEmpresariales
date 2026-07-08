package test;

import records.Notificacion;
import records.NotificacionCorreo;
import records.NotificacionPush;
import records.NotificacionSMS;

public class Test {
    public static void main(String[] args) {
        Notificacion[] notifications = {
                new NotificacionCorreo("juan@empresa.com", "Soporte", "Hola Juan"),
                new NotificacionCorreo("maria@empresa.com", "Factura", "Su factura está lista"),
                new NotificacionSMS("5512345678", "Tu código de verificación es 4821"),
                new NotificacionPush("abc123xyz987", "Tienes un nuevo mensaje"),
                new NotificacionSMS("5598765432", "Su paquete ha salido de la sucursal"),
                new NotificacionCorreo("pedro@empresa.com", "Alerta", "Inicio de sesión detectado"),
                new NotificacionPush("def456uvw123", "Actualización del sistema completada")
        };

        int correos = 0;
        int sms = 0;
        int push = 0;

        for (Notificacion n : notifications) {
            switch (n) {
                case NotificacionCorreo c -> correos++;
                case NotificacionSMS s -> sms++;
                case NotificacionPush p -> push++;
            }
        }

        int total = correos + sms + push;
        System.out.println("========= RESUMEN =========");
        System.out.println("Correos enviados:  " + correos);
        System.out.println("SMS enviados:     " + sms);
        System.out.println("Push enviados:    " + push);
        System.out.println("Total:            " + total);
    }
}
