package labJunit.app;

public class CompteBancaire {

    private double solde;

    public CompteBancaire(double monSolde) {
        solde = monSolde;
    }

    public double debiterSolde(double montant)
    {
        solde = solde - montant;
        return solde;
    }

    public double crediterSolde(double montant)
    {
        solde = solde + montant;
        return solde;
    }

}