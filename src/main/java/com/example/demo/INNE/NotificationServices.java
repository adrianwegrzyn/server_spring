//package com.example.demo.INNE;
//
//import com.example.demo.model.UsersEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.MailException;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.UsersService;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//@UsersService
//public class NotificationServices {
//    private JavaMailSender javaMailSender;
//
//    @Autowired
//    public NotificationServices(JavaMailSender javaMailSender){
//        this.javaMailSender =javaMailSender;
//    }
//    public void sendNotificaitoin(String s) throws MailException {
//        MimeMessage message = javaMailSender.createMimeMessage();
//
//
//        try {
//            MimeMessageHelper mail = new MimeMessageHelper(message, true);
//            mail.setTo(s);
//            mail.setFrom("k96.wowczuk@gmail.com");
//            mail.setSubject("Twój plan treningowy");
//            mail.setText("Oto plan treningowy");
//            FileSystemResource file = new FileSystemResource("C:\\UsersEntity\\k96wo\\Desktop\\JAVA\\tabelerrr.pdf");
//            mail.addAttachment(file.getFilename(),file);
//
//            javaMailSender.send(message);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//
//
//
//    }
//
//
//
//}
