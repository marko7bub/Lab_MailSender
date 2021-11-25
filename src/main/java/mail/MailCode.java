package mail;

import java.io.File;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        try {
            Scanner sc = new Scanner(System.in);
            File file = new File(sc.nextLine());
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                sb.append(line);
                sb.append("\n");
            }
            sc.close();
            return  sb.toString();
        }
        catch (Exception e) {
            return "";
        }
    }
}
