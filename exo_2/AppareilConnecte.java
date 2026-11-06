package exo_2;

public class AppareilConnecte {

    public String piece;

    public AppareilConnecte(String piece) {
        this.piece = piece;
    }

    public void diagnostiquer() {
       System.out.println("L'appareil situé dans" + this.piece + "fonctionne normalement.");
    }
}
