package com.ProductManagement.Ecommerce_platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Productdroguerie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String designation;

    private String fournisseur ;

    private String marque;

    private String prixtva;

    private  String quantite;




}
// 1.id dyal produit
// 2.sser