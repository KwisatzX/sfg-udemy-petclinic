package io.github.kwisatzx.springartgallery.services.map;

import io.github.kwisatzx.springartgallery.model.Painting;

public class PaintingServiceMap extends AbstractMapService<Painting, Long> {

    @Override
    public Painting save(Painting entity) {
        super.save(entity.getId(), entity);
        return entity;
    }
}
