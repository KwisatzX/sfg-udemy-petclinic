package io.github.kwisatzx.springartgallery.services;

import io.github.kwisatzx.springartgallery.model.Artist;

import java.util.Set;

public interface ArtistService {
    Artist findByLastName(String lastName);

    Artist findByPseudonym(String pseudonym);

    Artist findById(Long id);

    Artist save(Artist artist);

    Set<Artist> findAll();
}
