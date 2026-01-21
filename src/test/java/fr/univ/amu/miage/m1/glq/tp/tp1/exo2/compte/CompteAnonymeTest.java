package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.compte;

import fr.univ.amu.miage.m1.glq.tp.tp1.exo2.ExceptionSoldeInsuffisant;
import fr.univ.amu.miage.m1.glq.tp.tp1.exo2.personne.Personne;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("CompteAnonymeTest")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CompteAnonymeTest {

    CompteAnonyme compte = new CompteAnonyme(1000);

    CompteAnonyme compte2 = new CompteAnonyme(1000);

    @Test
    void Renvoie_IllegalArgumentException_Si_Montant_nul_ou_negatif_dans_depot(){
        assertThrows(IllegalArgumentException.class, () -> compte.depot(-10));
        assertThrows(IllegalArgumentException.class, () -> compte.depot(0));
    }

    @Test
    void Renvoie_IllegalArgumentException_Si_Montant_nul_ou_negatif_dans_retrait(){
        assertThrows(IllegalArgumentException.class, () -> compte.retrait(-10));
        assertThrows(IllegalArgumentException.class, () -> compte.retrait(0));
    }

    @Test
    void Renvoie_IllegalArgumentException_Si_Montant_nul_ou_negatif_dans_virement(){
        assertThrows(IllegalArgumentException.class, () -> CompteAnonyme.virement(compte,compte2, -10));
        assertThrows(IllegalArgumentException.class, () -> CompteAnonyme.virement(compte,compte2, -10));
    }

    @Test
    void Renvoie_ExceptionSoldeInsuffisant_Si_montant_superieur_au_solde_dans_virement(){
        assertThrows(ExceptionSoldeInsuffisant.class, () -> CompteAnonyme.virement(compte,compte2, 2000));
    }



}