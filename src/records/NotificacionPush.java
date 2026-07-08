package records;

public final record NotificacionPush(String tokenDispositivo, String mensaje) implements Notificacion {
    public NotificacionPush {
        if (tokenDispositivo == null || tokenDispositivo.isBlank()) {
            throw new IllegalArgumentException("El token del dispositivo no puede estar vacio ni ser nulo");
        }
    }

}
