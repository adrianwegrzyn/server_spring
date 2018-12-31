package com.example.demo.model;


import javax.persistence.*;


@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "message")
    private String message;

    @Column(name = "date")
    private String date;

    @Column(name = "iduser")
    private Integer iduser;

    public Chat() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }
}
