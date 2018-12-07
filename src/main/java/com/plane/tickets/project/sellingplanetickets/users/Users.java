package com.plane.tickets.project.sellingplanetickets.users;

import com.plane.tickets.project.sellingplanetickets.ticket.Ticket;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userID;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_surname")
    private String userSurname;

    @Column(name="email")
    private String email;

    @Column(name="user_password")
    private String userPassword;

    @Column(name="phone_number")
    private int phoneNumber;

    @Column(name="if_admin")
    private char ifAdmin;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Ticket> tickets;

    public Users(){

    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Users(String userName, String userSurname, String email, String userPassword, int phoneNumber, char ifAdmin) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
        this.userPassword = userPassword;
        this.phoneNumber = phoneNumber;
        this.ifAdmin = ifAdmin;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getIfAdmin() {
        return ifAdmin;
    }

    public void setIfAdmin(char ifAdmin) {
        this.ifAdmin = ifAdmin;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", email='" + email + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", ifAdmin=" + ifAdmin +
                '}';
    }
}
