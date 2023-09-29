package org.softuni.mobilele.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/offers")
public class OffersController {
    @GetMapping("/all")
    public String all() {
        return "offers";
    }
    @GetMapping("/add")
    public String add() {
        return "offer-add";
    }
    @GetMapping("/details")
    public String details() {
        return "details";
    }
    @GetMapping("/update")
    public String update() {
        return "update";
    }
    @GetMapping("/delete")
    public String delete() {
        return "offers";
    }
}
