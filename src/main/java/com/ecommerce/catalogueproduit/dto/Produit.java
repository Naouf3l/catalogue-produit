package com.ecommerce.catalogueproduit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Produit {

    String id;
    String name;
    String category;
    float price;
    boolean promotion;
}
