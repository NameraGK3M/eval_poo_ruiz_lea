package exo_4;

// Expliquer brièvement en commentaire au-dessus de la classe Smartphone comment traduire dans votre code le fait que la batterie appartienne exclusivement à ce smartphone et ne puisse pas exister indépendamment de lui.

// on met la batterie en private car c'est UNIQUEMENT pour le smartphone et rien de +

public class Smartphone {

    protected String modele;
    protected int batterie;

    public Smartphone() {
        private class BatterieInterne  {
            protected int capaciteMax;

            protected int getCapaciteMah(int mHa) {
                return mAh;
            };
        }
    }

    public void obtenirFicheTechnique(){
        System.out.println("Smartphone " + this.modele + " équipé d'une batterie scellée de " + this.batterie + " mAh.");
    }
}
