package com.ProductManagement.Ecommerce_platform.Controller;

import com.ProductManagement.Ecommerce_platform.entity.Productdroguerie;
import com.ProductManagement.Ecommerce_platform.service.ProdrogService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ecom_drog")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class PuductDrogController {
    private final ProdrogService prodrogService;

    @PostMapping("/produitmagasinbricolage")
    public Productdroguerie postProdrogg(@RequestBody Productdroguerie productdroguerie) {
        return prodrogService.postProdrog(productdroguerie);
    }

    @GetMapping("/produitmagasinbricolage")
    public List<Productdroguerie> getAllproductdrog() {
        return prodrogService.getAllproductdrog();
    }

    @DeleteMapping("/produitmagasinbricolage/{id}")
    public ResponseEntity<?> deleteProduit(@PathVariable Long id) {
        try {
            prodrogService.deleteProduit(id);
            return new ResponseEntity<>("PRODUCT With Id" + id + "deleted successefully", HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/produitmagasinbricolage/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        Productdroguerie productdroguerie = prodrogService.getProductById(id);
        if (productdroguerie == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(productdroguerie);
    }

    @PatchMapping("/produitmagasinbricolage/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody Productdroguerie productdroguerie) {
        Productdroguerie updatedProduct = prodrogService.updateProduct(id, productdroguerie);

        if (updatedProduct == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        return ResponseEntity.ok(updatedProduct);
    }

}

