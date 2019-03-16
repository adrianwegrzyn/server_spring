package com.example.demo.user;


import com.example.demo.auth.AuthenticationEntity;
import com.example.demo.user.body.BodyEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;


@Entity
@Table(name = "users",schema = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    @Column(name="e_mail")
    private String email;
    @Column(name="photo")
    private String photo;
    @Column(name="data_of_birth")
    private String dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_body")
    private BodyEntity body;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authenticationEntity")
    private AuthenticationEntity authenticationEntity;



    public void setBody(BodyEntity body) {
        this.body = body;
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





}