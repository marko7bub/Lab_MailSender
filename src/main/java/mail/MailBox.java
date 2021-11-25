package mail;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<MailInfo>();

    public void addMailInfo(MailInfo mailInfo) {
        this.infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo mailInfo : this.infos) {
            MailSender.sendMail(mailInfo);
        }
    }
}
