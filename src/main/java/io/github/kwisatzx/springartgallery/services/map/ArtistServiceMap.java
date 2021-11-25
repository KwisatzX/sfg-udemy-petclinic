package io.github.kwisatzx.springartgallery.services.map;

import io.github.kwisatzx.springartgallery.model.Artist;
import io.github.kwisatzx.springartgallery.services.CrudService;

public class ArtistServiceMap extends AbstractMapService<Artist, Long>
        implements CrudService<Artist, Long> {

    @Override
    public Artist save(Artist entity) {
        super.save(entity.getId(), entity);
        return entity;
    }
}
