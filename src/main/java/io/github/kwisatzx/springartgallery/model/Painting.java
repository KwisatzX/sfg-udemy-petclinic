package io.github.kwisatzx.springartgallery.model;

import java.time.Year;

public class Painting extends NamedEntity {

    private Artist author;
    private PaintingType type;
    private Year creationYear;

    public Artist getAuthor() {
        return author;
    }

    public void setAuthor(Artist author) {
        this.author = author;
    }

    public PaintingType getType() {
        return type;
    }

    public void setType(PaintingType type) {
        this.type = type;
    }

    public Year getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(Year creationYear) {
        this.creationYear = creationYear;
    }
}
