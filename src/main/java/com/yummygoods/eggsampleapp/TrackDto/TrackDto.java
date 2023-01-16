package com.yummygoods.eggsampleapp.TrackDto;

import com.yummygoods.eggsampleapp.model.Track;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Track} entity
 */
public record TrackDto(Integer ID, String name,
                       String notes) implements Serializable {

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
    public String toString() {
        return getClass().getSimpleName() + "(" +
                       "ID = " + ID + ", " +
                       "name = " + name + ", " +
                       "notes = " + notes + ")";
    }
}