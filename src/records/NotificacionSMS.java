package records;

public final record NotificacionSMS(String numero, String mensaje) implements Notificacion {
    public NotificacionSMS {
        if (!(numero.matches("\\d{10}"))) {
            throw new IllegalArgumentException("Numero de telefono debe ser cadena con 10 digitos");
        }
    }
}
