package factory;

import model.Notificator;
import strategy.EmailNotificator;
import strategy.PushNotificator;
import strategy.SMSNotificator;

public class NotificatorFactory {
    public static Notificator create(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotificator();
            case "sms" -> new SMSNotificator();
            case "push" -> new PushNotificator();
            default -> throw new IllegalArgumentException("Tipo de notificação inválido: " + type);
        };
    }
}
