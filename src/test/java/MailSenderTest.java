import client.Client;
import client.Sex;
import mail.MailCode;
import mail.MailInfo;
import mail.MailSender;
import org.junit.Test;
import static org.junit.Assert.*;

public class MailSenderTest {

    Client cl1 = new Client("Arman", 73, Sex.MALE);
    Client cl2 = new Client("Valera", 33, Sex.NONBINARY);

    @Test
    public void IdTest() {
        assertEquals(cl1.getId(), 1);
        assertEquals(cl2.getId(), 2);
    }

    @Test
    public void SendTest() {
        MailInfo mail1 = new MailInfo(cl2, MailCode.HAPPY_BIRTHDAY);
        assertEquals(MailSender.sendMail(mail1), "Mail has been sent to client " + cl2.getId());
    }

}
