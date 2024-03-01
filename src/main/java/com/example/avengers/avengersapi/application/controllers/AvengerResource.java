package com.example.avengers.avengersapi.application.controllers;

import com.example.avengers.avengersapi.domain.dto.AvengerRequest;
import com.example.avengers.avengersapi.domain.dto.AvengerResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/api/avenger")
public class AvengerResource {

    @GetMapping
    public ResponseEntity<List<AvengerResponse>> getAvengers(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AvengerResponse> getAvengerDetails(@PathVariable("id") Long id){
        return ResponseEntity.ok(new AvengerResponse());
    }

    @PostMapping
    public ResponseEntity<AvengerResponse> createAvenger(@Valid @RequestBody AvengerRequest avengerRequest){
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
