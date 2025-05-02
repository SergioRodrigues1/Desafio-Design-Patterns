package strategy;

import model.Notificator;

public class PushNotificator implements Notificator {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando notificação push: " + message);
    }
}
