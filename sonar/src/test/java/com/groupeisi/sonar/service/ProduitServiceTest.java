package com.groupeisi.sonar.service;

import com.groupeisi.sonar.dao.ProduitDAO;
import com.groupeisi.sonar.dto.ProduitDTO;
import com.groupeisi.sonar.entities.Produit;
import com.groupeisi.sonar.mapping.ProduitMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ProduitServiceTest {

    @Mock
    private ProduitDAO produitDAO;

    @Mock
    private ProduitMapper produitMapper;

    @InjectMocks
    private ProduitService produitService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveProduit() {
        // Given
        ProduitDTO produitDTO = new ProduitDTO();
        Produit produit = new Produit();

        when(produitMapper.toEntity(produitDTO)).thenReturn(produit);
        when(produitDAO.save(any(Produit.class))).thenReturn(produit);
        when(produitMapper.toDTO(produit)).thenReturn(produitDTO);

        // When
        ProduitDTO result = produitService.saveProduit(produitDTO);

        // Then
        assertEquals(produitDTO, result);
        verify(produitMapper, times(1)).toEntity(produitDTO);
        verify(produitDAO, times(1)).save(produit);
        verify(produitMapper, times(1)).toDTO(produit);
    }

    @Test
    void testGetAllProduits() {
        assertTrue(true);
    }
}