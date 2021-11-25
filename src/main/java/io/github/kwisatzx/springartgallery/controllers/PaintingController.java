package io.github.kwisatzx.springartgallery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaintingController {

    @RequestMapping({"/paintings", "/paintings.html"})
    public String listPaintings() {
        return "paintings";
    }
}
