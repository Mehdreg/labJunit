package labJunit.app;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double debiterSolde(double montant) {
        return solde-montant;
    }
    
    public double crediterSolde(double montant) {
    	return solde+montant;
    }
}
