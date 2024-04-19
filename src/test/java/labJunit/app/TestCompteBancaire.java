package labJunit.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCompteBancaire {
    
    @Test
    public void testDebiterSoldeCasLimite() {
        CompteBancaire compte = new CompteBancaire(1000);
        double soldeApresDebit = compte.debiterSolde(500);
        assertEquals(500, soldeApresDebit, 0);
    }
    
    @Test
    public void testDebiterSoldeMontantSuperieurAuSolde() {
        CompteBancaire compte = new CompteBancaire(1000);
        double soldeApresDebit = compte.debiterSolde(1500);
        assertEquals(1000, soldeApresDebit, 0);
    }
    
    @Test
    public void testCrediterSoldeCasLimite() {
        CompteBancaire compte = new CompteBancaire(1000);
        double soldeApresCredit = compte.crediterSolde(500);
        assertEquals(1500, soldeApresCredit, 0);
    }
    
    @Test
    public void testCrediterSoldeMontantNegatif() {
        CompteBancaire compte = new CompteBancaire(1000);
        double soldeApresCredit = compte.crediterSolde(-500);
        assertEquals(1000, soldeApresCredit, 0);
    }
}