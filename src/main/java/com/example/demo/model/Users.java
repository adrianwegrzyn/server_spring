//package com.example.demo.model;
//
//
//
//import javax.persistence.*;
//import javax.validation.constraints.Email;
//
//@Entity
//@Table(name = "users",schema = "public")
//public class Users {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_user")
//    private Integer idUser;
//    @Column(name = "nick")
//    private String nick;
//    @Column(name="photo")
//    private String photo;
//
//
//
//
//    public Users() {
//    }
//
//    public Integer getIdUser() {
//        return idUser;
//    }
//
//    public void setIdUser(Integer idUser) {
//        this.idUser = idUser;
//    }
//
//    public String getNick() {
//        return nick;
//    }
//
//    public void setNick(String nick) {
//        this.nick = nick;
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }
//}