package exo_1;

public class ArticleStock {

    private String nom;
    private int quantite;

    public ArticleStock(String nom, int quantite) {
        this.nom = nom;
        this.quantite = 0;
    }

    public String getNom() {
        return nom;
    }
    public int getQuantite() {
        return quantite;
    }

    public void approvisionner(int nb) {
        if (nb > 0) {
            this.quantite += nb;
        }
    }
    public void expedier(int nb) {
        if (nb >= this.quantite) {
            this.quantite -= nb;
            System.out.println("Il reste" + this.quantite + "quantite");
            System.out.println("Expédition de " + this.quantite + " unités validée.");
        } else {
            System.out.println("Erreur : stock insuffisant pour expédier " + this.quantite + " unités.");
        }
    }
}