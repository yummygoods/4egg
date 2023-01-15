package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="tracks", schema="4eggs")
public class Track{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer ID;

    public Track() {
    }

    public Integer getId() {
        return ID;
    }

    public void setId(Integer id) {
        this.ID = id;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Track(Integer ID){
        this.ID = ID;

    }
}
