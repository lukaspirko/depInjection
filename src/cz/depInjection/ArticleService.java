package cz.depInjection;

public class ArticleService {
    private EmailService emailService;

    public ArticleService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void publishArticle() {
        // publish article
        emailService.sendEmail("test@gmail.com", "New article was published");
    }
}
