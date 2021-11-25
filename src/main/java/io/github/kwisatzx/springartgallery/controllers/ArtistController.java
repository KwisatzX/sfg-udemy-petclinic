package io.github.kwisatzx.springartgallery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtistController {

    @RequestMapping({"/artists", "/artists.html"})
    public String listArtists() {
        return "artists";
    }
}
