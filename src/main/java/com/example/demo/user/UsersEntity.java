package com.example.demo.user;


import com.example.demo.user.body.BodyEntity;
 import javax.persistence.*;



@Entity
@Table(name = "users",schema = "users")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "nick")
    private String nick;
    @Column(name="e_mail")
    private String email;
    @Column(name="photo")
    private String photo;
    @Column(name="data_of_birth")
    private String dateOfBirth;
    @Column(name="password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_body")
    private BodyEntity body;




    public UsersEntity() {
    }


    public Integer getIdUser() {
        return idUser;
    }

    public BodyEntity getBody() {
        return body;
    }

    public void setBody(BodyEntity body) {
        this.body = body;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}