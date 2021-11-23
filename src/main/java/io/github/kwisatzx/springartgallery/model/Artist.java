package io.github.kwisatzx.springartgallery.model;

import javax.persistence.Column;
import java.util.Set;

public class Artist extends Person {

    @Column(name = "pseudonym")
    private String pseudonym;

    private Set<Painting> paintings;
}
