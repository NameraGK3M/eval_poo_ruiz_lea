package exo_3;

public class ChambreHotel extends Hebergement {

    public double supplementPetitDejeuner;

    public ChambreHotel(double supPetitDej) {
        this.supplementPetitDejeuner = supPetitDej;
    };

    public double calculerPrixSejour(double nbNuits){
        double total = this.tarifJournalier + this.supplementPetitDejeuner * nbNuits;
        return total;
    };
}