package org.softuni.mobilele.service.impl;

import org.modelmapper.ModelMapper;
import org.softuni.mobilele.model.dto.AddOfferDTO;
import org.softuni.mobilele.model.dto.OfferDTO;
import org.softuni.mobilele.model.entity.Model;
import org.softuni.mobilele.model.entity.Offer;
import org.softuni.mobilele.repository.ModelRepository;
import org.softuni.mobilele.repository.OfferRepository;
import org.softuni.mobilele.repository.UserRepository;
import org.softuni.mobilele.service.BrandService;
import org.softuni.mobilele.service.OfferService;
import org.softuni.mobilele.user.CurrentUser;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService {
    public final CurrentUser currentUser;
    private final UserRepository userRepository;
    private final ModelRepository modelRepository;
    private final BrandService brandService;
    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;

    public OfferServiceImpl(CurrentUser currentUser, UserRepository userRepository, ModelRepository modelRepository, BrandService brandService, OfferRepository offerRepository, ModelMapper modelMapper) {
        this.currentUser = currentUser;
        this.userRepository = userRepository;
        this.modelRepository = modelRepository;
        this.brandService = brandService;
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
        //TODO: To rework this method to use not different repository's but different services.
        Offer offer = modelMapper.map(addOfferDTO, Offer.class);
        Model model = modelRepository.findById(addOfferDTO.getModelId()).orElse(null);
        offer.setModel(model)
                .setCreated(LocalDateTime.now())
                .setModified(LocalDateTime.now())
                .setUser(userRepository.getByEmail(currentUser.getEmail()).orElse(null))
                .setId(null);
        offerRepository.save(offer);
    }

    @Override
    public OfferDTO getOfferById(Long id) {
        Optional<Offer> optionalOffer = offerRepository.findById(id);
        OfferDTO offerDTO = modelMapper.map(optionalOffer, OfferDTO.class);
        return offerDTO;
    }

    @Override
    public void update(AddOfferDTO addOfferDTO, OfferDTO offerDTO) {
        Offer offer = modelMapper.map(addOfferDTO, Offer.class);
        Model model = modelRepository.findById(addOfferDTO.getModelId()).orElse(null);
        offer.setModel(model)
                .setCreated(offer.getCreated() == null ? LocalDateTime.now() : offer.getCreated())
                .setModified(LocalDateTime.now())
                .setUser(userRepository.getByEmail(currentUser.getEmail()).orElse(null))
                .setId(offerDTO.getId());
        Offer rawOffer = offerRepository.findById(offerDTO.getId()).orElse(null).setModified(LocalDateTime.now());
        offer.setCreated(rawOffer.getCreated());
        modelMapper.map(offer, rawOffer);
        offerRepository.save(rawOffer);
    }

    @Override
    public void delete(OfferDTO offerDTO) {
        Offer offer = offerRepository.findById(offerDTO.getId()).orElse(null);
        if (offer != null && currentUser.isLoggedIn()) {
            offerRepository.delete(offer);
        }
    }


}
