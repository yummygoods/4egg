package model;

@Entity
public class Track{
    private Integer ID;

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
