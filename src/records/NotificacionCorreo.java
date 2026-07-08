package records;

public final record NotificacionCorreo(String correo, String asunto, String contenido) implements Notificacion{
    public NotificacionCorreo {
        if (!(correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"))) {
            throw new IllegalArgumentException("Correo no cumple formato correcto");
        }
    }
}
