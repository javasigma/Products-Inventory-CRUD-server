package com.ProductManagement.Ecommerce_platform.service;

import com.ProductManagement.Ecommerce_platform.entity.Productdroguerie;
import com.ProductManagement.Ecommerce_platform.repository.ProdrogRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
 public class ProdrogService {

    private final ProdrogRepo prodrogRepo;

    public Productdroguerie postProdrog(Productdroguerie productdroguerie){
        return prodrogRepo.save(productdroguerie);
    }
    public List<Productdroguerie> getAllproductdrog(){
        return prodrogRepo.findAll();
    }
    public void deleteProduit(Long id){
        if (!prodrogRepo.existsById(id)){
            throw new EntityNotFoundException("Product with Id"+id+"not found");
        }
        prodrogRepo.deleteById(id);
    }
    public Productdroguerie getProductById(Long id){
        return  prodrogRepo.findById(id).orElse(null);
    }
    public Productdroguerie updateProduct(Long id, Productdroguerie productdroguerie) {
        // Fetch the existing product by ID
        Optional<Productdroguerie> optionalProductdroguerie= prodrogRepo.findById(id);
        if (optionalProductdroguerie.isPresent()) {
            Productdroguerie existingProduct = optionalProductdroguerie.get();
            // Update the fields of the existing product with the new data
            existingProduct.setNom(productdroguerie.getNom());
            existingProduct.setDesignation(productdroguerie.getDesignation());
            existingProduct.setMarque(productdroguerie.getMarque());
            existingProduct.setFournisseur(productdroguerie.getFournisseur());
            existingProduct.setQuantite(productdroguerie.getQuantite());
            existingProduct.setPrixtva(productdroguerie.getPrixtva());
            return prodrogRepo.save(existingProduct);
        }
      return null;
    }
}

