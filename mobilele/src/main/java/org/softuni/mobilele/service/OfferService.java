package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.AddOfferDTO;
import org.softuni.mobilele.model.dto.OfferDTO;

import java.util.List;

public interface OfferService {
    public List<OfferDTO> getAllOffers();
    public void addOffer(AddOfferDTO addOfferDTO);
}
