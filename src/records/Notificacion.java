package records;

public sealed interface Notificacion permits NotificacionCorreo, NotificacionPush, NotificacionSMS {

}
