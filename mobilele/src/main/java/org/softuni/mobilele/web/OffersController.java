package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.OfferDTO;
import org.softuni.mobilele.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/offers")
public class OffersController {
    public final OfferService offerService;

    public OffersController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/all")
    public String all(Model model) {
        model.addAttribute("listOfOffers", offerService.getAllOffers());
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
