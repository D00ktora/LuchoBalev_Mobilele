package org.softuni.mobilele.service.impl;

import org.modelmapper.ModelMapper;
import org.softuni.mobilele.model.dto.AddOfferDTO;
import org.softuni.mobilele.model.dto.BrandsDTO;
import org.softuni.mobilele.model.dto.OfferDTO;
import org.softuni.mobilele.model.entity.Offer;
import org.softuni.mobilele.repository.OfferRepository;
import org.softuni.mobilele.service.OfferService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {
    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;

    public OfferServiceImpl(OfferRepository offerRepository, ModelMapper modelMapper) {
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<OfferDTO> getAllOffers() {
        List<Offer> offers = this.offerRepository.getAllBy().orElse(null);
        if (offers != null) {
            List<OfferDTO> offerDTOS = offers.stream().map(offer -> modelMapper.map(offer, OfferDTO.class)).toList();
            return offerDTOS;
        }
        return null;
    }

    @Override
    public void addOffer(AddOfferDTO addOfferDTO) {

    }
}
