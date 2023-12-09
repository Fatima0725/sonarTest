package com.groupeisi.sonar.mapping;

import com.groupeisi.sonar.dto.ProduitDTO;
import com.groupeisi.sonar.entities.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProduitMapper {

    @Mapping(target = "id", ignore = true)
    Produit toEntity(ProduitDTO produitDTO);

    ProduitDTO toDTO(Produit produit);
}

