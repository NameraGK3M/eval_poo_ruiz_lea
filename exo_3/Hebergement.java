package exo_3;

public abstract class Hebergement {
    protected String reference;
    protected int tarifJournalier;

    public Hebergement(String ref, int tarif) {
        this.reference = ref;
        this.tarifJournalier = tarif;
    }
    // abstract void calculerPrixSejour(nbNuits) {}

    public void decrire() {
        System.out.println("Hébergement " + this.reference + " Tarif de base : " + this.tarifJournalier + " €/nuit");
    }
}
