package strategy;

import model.Notificator;

public class EmailNotificator implements Notificator {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}
