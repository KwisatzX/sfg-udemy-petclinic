package io.github.kwisatzx.springartgallery.services;

import io.github.kwisatzx.springartgallery.model.Artist;

public interface ArtistService extends CrudService<Artist, Long> {

    Artist findByLastName(String lastName);

    Artist findByPseudonym(String pseudonym);
}
