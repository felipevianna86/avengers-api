package com.example.avengers.avengersapi.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AvengerRequest {

    @NotNull
    @NotBlank
    @NotBlank
    private String nickname, person;
    private String description, history;
}
