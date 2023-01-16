package com.yummygoods.eggsampleapp.model;

import jakarta.persistence.*;

@Entity
@Table(name="tracks", schema="4eggs")
public class Track{

    //fields and annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer ID;



    @Column
    public String name;

    @Column
    public String notes;




//no args constructor
    public Track() {
    }
//basic constructor
    public Track(Integer ID){
        this.ID = ID;

    }

    //getter
    public Integer getID() {
        return ID;
    }

    //toString method
    @Override
    public String toString() {
        return "Track{" +
                       "ID=" + ID +
                       '}';
    }
// how to handle setter when it's not updatable?
    //public void setId(Integer id) {
   //     this.ID = id;
  //  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
