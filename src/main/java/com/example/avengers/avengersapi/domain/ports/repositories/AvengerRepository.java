package com.example.avengers.avengersapi.domain.ports.repositories;

import com.example.avengers.avengersapi.domain.Avenger;

import java.util.List;

public interface AvengerRepository {

    Avenger getAvengerDetails(final Long id);
    List<Avenger> getAvengers();
    Avenger save(final Avenger avenger);

    void delete(final Long id);

}
