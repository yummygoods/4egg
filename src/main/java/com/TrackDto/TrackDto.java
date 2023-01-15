package com.TrackDto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.model.Track} entity
 */
public class TrackDto implements Serializable {
    private final Integer ID;
    private final String name;
    private final String notes;

    public TrackDto(Integer ID, String name, String notes) {
        this.ID = ID;
        this.name = name;
        this.notes = notes;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TrackDto entity = (TrackDto) o;
        return Objects.equals(this.ID, entity.ID) &&
                       Objects.equals(this.name, entity.name) &&
                       Objects.equals(this.notes, entity.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, notes);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                       "ID = " + ID + ", " +
                       "name = " + name + ", " +
                       "notes = " + notes + ")";
    }
}