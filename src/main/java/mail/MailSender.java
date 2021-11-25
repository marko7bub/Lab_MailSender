package mail;

public class MailSender {
    public static String sendMail(MailInfo mailInfo) {
        return "Mail has been sent to client " + mailInfo.getClient().getId();
    }
}
