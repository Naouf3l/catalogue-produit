package com.ecommerce.catalogueproduit.controller;

import com.ecommerce.catalogueproduit.dto.Produit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitController {

    @GetMapping("/produit")
    public Produit getAProduit(){
        return Produit.builder()
                .id("1")
                .price(255.55F)
                .name("Iphone 13")
                .promotion(true)
                .category("Smartphone")
                .build();
    }
}
