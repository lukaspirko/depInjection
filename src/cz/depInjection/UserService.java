package cz.depInjection;

public class UserService {
    private EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createAccount() {
        // create account
        emailService.sendEmail("test@gmail.com", "Hello world");
    }
}
