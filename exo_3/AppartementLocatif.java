package exo_3;

public class AppartementLocatif extends Hebergement{
    public double fraisMenageFixes;

    public AppartementLocatif(double frais) {
        this.fraisMenageFixes = frais;
    }
    public double calculerPrixSejour(double nbNuits) {
        double total = this.tarifJournalier * nbNuits + this.fraisMenageFixes;
        return total;
    }
}
