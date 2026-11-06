package exo_2;

public class CameraSecurite extends AppareilConnecte {

    public String camera;

    public CameraSecurite(String cam) {
        this.camera = cam;
    }

    @Override
    public void diagnostiquer() {
        super.diagnostiquer();
        System.out.println("La caméra de " + this.piece + " filme en haute définition.");
    }
}
