import exo_1.ArticleStock;
import exo_2.AppareilConnecte;
import exo_2.CameraSecurite;
import exo_2.Thermostat;
import exo_3.AppartementLocatif;
import exo_3.ChambreHotel;
import exo_4.Smartphone;

public class Main {
    public static void main(String[] args) {
        // exo 1
        ArticleStock articleStock = new ArticleStock("Claviers mécanique", 0);
        approvisionner(15);

        // exo 2
        AppareilConnecte appareilConnecte = new AppareilConnecte("Couloir");
        Thermostat thermostat = new Thermostat("Salon");
        CameraSecurite cameraSecurite = new CameraSecurite("Entrée");

        // exo 3
        ChambreHotel chambreHotel = new ChambreHotel(12.5);
        AppartementLocatif appartementLocatif = new AppartementLocatif(50.0);

        // exo 4
        Smartphone smartphone = new Smartphone("Pixel Pro", 5000);
    }
}
