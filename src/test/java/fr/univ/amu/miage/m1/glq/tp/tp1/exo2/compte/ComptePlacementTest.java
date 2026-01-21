package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.compte;

import fr.univ.amu.miage.m1.glq.tp.tp1.exo2.personne.Personne;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ComptePlacementTest")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ComptePlacementTest {

    Personne personne = new Personne("Jean", "Dupont",2025);

    ComptePlacement compte = new ComptePlacement(personne, 1000);

    @Test
    void Renvoie_IUnsupportedOperationException_Si_Depot_Dans_Compte_Placement(){
        assertThrows(UnsupportedOperationException.class, () -> compte.depot(10));
    }

}