package com.yummygoods.eggsampleapp.model;


import jakarta.persistence.*;


@Entity
@Table(name="images", schema="4eggs")
public class Image{

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private Integer  id;

    @Lob
    byte[] content;

    @Column
    String name;
    @Column
    String location;



    //no args constructor
    public Image() {
    }


    public Image(Integer id, byte[] content, String name, String location) {
        this.id = id;
        this.content = content;
        this.name = name;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public Image save(Image image) {
        return null;
    }
}
