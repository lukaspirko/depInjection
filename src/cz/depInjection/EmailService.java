package cz.depInjection;

public class EmailService {
    public EmailService() {
        System.out.println("new instance email service");
    }

    public void sendEmail(String to, String body) {
        System.out.println("Sending email to: " + to + " body: " + body);
    }
}
