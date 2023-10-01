package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.AddOfferDTO;
import org.softuni.mobilele.model.dto.BrandsDTO;
import org.softuni.mobilele.model.dto.OfferDTO;

import java.util.List;

public interface OfferService {
    List<OfferDTO> getAllOffers();
    void addOffer(AddOfferDTO addOfferDTO);
}
