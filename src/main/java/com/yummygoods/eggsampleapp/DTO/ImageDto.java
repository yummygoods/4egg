package com.yummygoods.eggsampleapp.DTO;

import java.util.Objects;


public  class ImageDto {

    public Integer id;
    public byte[] content;
    public String name;
    public String location;


    public ImageDto(Integer id, byte[] content, String name,
                    String location) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        com.yummygoods.eggsampleapp.DTO.ImageDto entity = (com.yummygoods.eggsampleapp.DTO.ImageDto) o;
        return Objects.equals(this.id, entity.id) &&
                       Objects.equals(this.content, entity.content) &&
                       Objects.equals(this.name, entity.name) &&
                       Objects.equals(this.location, entity.location);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                       "id = " + id + ", " +
                       "content = " + content + ", " +
                       "name = " + name + ", " +
                       "location = " + location + ")";
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, content, name, location);
    }

}