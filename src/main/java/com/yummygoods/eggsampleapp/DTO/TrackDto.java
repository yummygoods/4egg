package com.yummygoods.eggsampleapp.DTO;

import java.util.Objects;

public class TrackDto {
    public Integer id;
    public String name;
    public String notes;


    public TrackDto(Integer id, String name, String notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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


    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                       "ID = " + id + ", " +
                       "name = " + name + ", " +
                       "notes = " + notes + ")";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TrackDto entity = (TrackDto) o;
        return Objects.equals(this.id, entity.id) &&
                       Objects.equals(this.name, entity.name) &&
                       Objects.equals(this.notes, entity.notes);
    }
}

