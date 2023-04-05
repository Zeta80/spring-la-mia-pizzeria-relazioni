package org.lessons.pizzery.springlamiapizzeriacrud.service;

import org.lessons.pizzery.springlamiapizzeriacrud.model.Offer;
import org.lessons.pizzery.springlamiapizzeriacrud.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    public Offer create(Offer formOffer) {
        return offerRepository.save(formOffer);
    }
}
