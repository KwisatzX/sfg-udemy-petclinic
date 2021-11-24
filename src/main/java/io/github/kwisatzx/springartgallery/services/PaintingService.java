package io.github.kwisatzx.springartgallery.services;

import io.github.kwisatzx.springartgallery.model.Painting;

import java.util.Set;

public interface PaintingService {
    Painting findByName(String name);

    Painting findByArtist(String artistName);

    Painting findById(Long id);

    Painting save(Painting painting);

    Set<Painting> findAll();
}
