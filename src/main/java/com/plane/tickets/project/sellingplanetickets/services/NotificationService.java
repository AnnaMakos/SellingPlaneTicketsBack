package com.plane.tickets.project.sellingplanetickets.services;

import com.plane.tickets.project.sellingplanetickets.model.Ticket;
import com.plane.tickets.project.sellingplanetickets.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class NotificationService {

    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification(User user) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo(user.getEmail());
        mail.setFrom("latajtaniopl@gmail.com");
        mail.setSubject(user.getName() + " witaj na naszej stronie!");
        mail.setText("Rejestracja przebiegła pomyślnie. Możesz teraz w pełni korzystać z naszej strony.");
        javaMailSender.send(mail);
    }

    public void sendTicket(Ticket ticket) throws MailException, ParseException {
        SimpleMailMessage mail = new SimpleMailMessage();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


        String dateStringDeparture = format.format(ticket.getFlight().getDepartureDate());
        String dateStringArrival = format.format(ticket.getFlight().getArrivalDate());

        String insurance;

        if (ticket.isInsurance()==true) {
            insurance = "Bilet ubezpieczony. \n \n";
        } else {
            insurance = "Bilet nieubezpieczony. \n \n";
        }


        mail.setTo(ticket.getUser().getEmail());
        mail.setFrom("latajtaniopl@gmail.com");
        mail.setSubject("Bilet nr " + ticket.getTicketID() + ", " + dateStringDeparture);


        StringBuilder stringBuilder = new StringBuilder("Bilet nr ");

        stringBuilder
                .append(ticket.getTicketID()).append(": \n")
                .append("Imię: ").append(ticket.getName()).append("\n")
                .append("Nazwisko: ").append(ticket.getSurname()).append("\n")
                .append("PESEL: ").append(ticket.getPesel()).append("\n")
                .append("Numer telefonu: ").append(ticket.getPhonenumber()).append("\n")
                .append("Z: ").append(ticket.getFlight().getConnection().getDepartureAirport().getAirportName()).append("\n")
                .append("Do: ").append(ticket.getFlight().getConnection().getArrivalAirport().getAirportName()).append("\n")
                .append("Data wylotu: ").append(dateStringDeparture).append("\n")
                .append("Czas wylotu: ").append(ticket.getFlight().getDepartureTime()).append("\n")
                .append("Data przylotu: ").append(dateStringArrival).append("\n")
                .append("Czas przylotu: ").append(ticket.getFlight().getArrivalTime()).append("\n")
                .append("Rząd: ").append(ticket.getWhichRow()).append("\n")
                .append("Miejsce: ").append(ticket.getPlace()).append("\n")
                .append("Klasa: ").append(ticket.getCategory()).append("\n")
                .append("Cena biletu: ").append(ticket.getTicketCost()).append("\n")
                .append("Samolot: ").append(ticket.getFlight().getPlane().getPlaneName()).append("\n")
                .append(insurance)
                .append("Dziękujemy za skorzystanie z naszych usług. Swoje bilety możesz także zobaczyć po zalogowaniu na naszej stronie");


        mail.setText(stringBuilder.toString());
        javaMailSender.send(mail);
    }

}
