package com.groupeisi.sonar.dao;

import com.groupeisi.sonar.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitDAO extends JpaRepository<Produit, Long> {

}