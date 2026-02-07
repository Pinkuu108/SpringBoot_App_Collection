package in.pinku.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class PurchaseOrderImpl implements IpurchaseOrder {

    @Autowired
    private JavaMailSender sender;

    @Value("${spring.mail.username}")
    private String fromEmail;

    @Override
    public String sendMail(String[] emails) throws Exception {

        // 💔 Heartbreak message
        String msg = "You broke my heart so silently,\n"
                   + "like a wave leaving the shore quietly.\n"
                   + "I smiled outside, cried inside,\n"
                   + "some stories end before they even start.@CHINMAYEE_SAHOO";

        // ✉️ Create and send mail
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom(fromEmail);
        helper.setTo(emails);
        helper.setSubject("Open it to know it ❤️");
        helper.setSentDate(new Date());
        helper.setText(msg);

        // Optional: Add image (remove if not needed)
        helper.addAttachment("pinku.jpg", new ClassPathResource("pinku.jpg"));

        sender.send(message);

        return "Mail sent successfully!";
    }
}
