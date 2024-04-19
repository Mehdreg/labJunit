package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCompteBancaire {
    @Test
    void testDebiter() {
        CompteBancaire c = new CompteBancaire(100);
        assertEquals(99.5,c.debiterSolde(0.5));
    }

    @Test
    void testDebiterZero() {
        CompteBancaire c = new CompteBancaire(100);
        assertEquals(100,c.debiterSolde(0));
    }

    @Test
    void testCrediter() {
        CompteBancaire c = new CompteBancaire(100);
        assertEquals(110,c.crediterSolde(10));
    }

    @Test
    void testCrediterZero() {
        CompteBancaire c = new CompteBancaire(100);
        assertEquals(100,c.crediterSolde(0));
    }
}


