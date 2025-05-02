package app;
import config.ConfigManager;
import factory.NotificatorFactory;
import model.Notificator;

public class Main{
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        config.setDefaultNotificator("sms");

        Notificator notificator = NotificatorFactory.create(config.getDefaultNotificator());
        notificator.sendNotification("Olá, este é um teste de notificação!");
    }
}