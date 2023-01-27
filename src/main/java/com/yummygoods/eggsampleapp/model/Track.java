package com.yummygoods.eggsampleapp.model;

import com.yummygoods.eggsampleapp.DTO.TrackDto;
import jakarta.persistence.*;

@Entity
@Table(name="tracks", schema="4eggs")
public class Track{

    //fields and annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column
    public String name;

    @Column
    public String notes;




//no args constructor
    public Track() {
    }
//basic constructor
    public Track(TrackDto trackDto){
        this.id = trackDto.id;
        this.name = trackDto.name;
        this.notes = trackDto.notes;


    }

    //getter
    public Integer getID() {
        return id;
    }

    //toString method
    @Override
    public String toString() {
        return "Track{" +
                       "ID=" + id +
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
