package io.github.kwisatzx.springartgallery.services;

import io.github.kwisatzx.springartgallery.model.Painting;

public interface PaintingService extends CrudService<Painting, Long> {

    Painting findByName(String name);

    Painting findByArtist(String artistName);
}
