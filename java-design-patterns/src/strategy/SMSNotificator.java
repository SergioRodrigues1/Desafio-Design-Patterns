package strategy;

import model.Notificator;

public class SMSNotificator implements Notificator {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
