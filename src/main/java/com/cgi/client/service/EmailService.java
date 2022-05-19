package com.cgi.client.service;

import com.cgi.client.vo.EmailRequestVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Component
public class EmailService {
    @Value("${spring.mail.subject}")
    private String subject;

    @Value("${spring.mail.from}")
    private String from;

    @Value("${spring.mail.to}")
    private String[] to;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private SecretManagerService secretManagerService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private FutureClientService futureClientService;

    public void export() throws IOException {
        ((JavaMailSenderImpl) javaMailSender).setPassword(secretManagerService.accessSecretVersion("smtp-password", "latest"));
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                    "Cp1250");
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setFrom(from);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setText("Automatic export", true);
            //mimeMessageHelper.addAttachment("vanoceId", new FileSystemResource(""));
            javaMailSender.send(mimeMessageHelper.getMimeMessage());
            log.info("email to {} send succesfully", to);
        } catch (MessagingException e) {
            log.error("Error sending email {}", e.getMessage());
        }
    }

    public String getEmailAdresses() {
        Stream<String> combinedStream = Stream.concat(clientService.getAllEmailAdresses().stream(), futureClientService.getAllEmailAdresses().stream());
        return String.join(",", combinedStream.collect(Collectors.toList()));
    }

    public void sendEmail(EmailRequestVO emailRequest) throws IOException {
        String[] to = emailRequest.getTo().split(",");
        for (int i = 0; i < to.length; i++) {
            ((JavaMailSenderImpl) javaMailSender).setPassword(secretManagerService.accessSecretVersion("smtp-password", "latest"));
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            try {
                MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                        "Cp1250");
                mimeMessageHelper.setSubject(emailRequest.getSubject());
                mimeMessageHelper.setFrom(from);
                mimeMessageHelper.setTo(to[i]);
                mimeMessageHelper.setText(emailRequest.getTemplate(), true);
                javaMailSender.send(mimeMessageHelper.getMimeMessage());
                log.info("email to {} send succesfully", to[i]);
            } catch (MessagingException e) {
                log.error("Error sending email {}", e.getMessage());
            }
        }
    }
}
