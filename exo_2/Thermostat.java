package exo_2;

public class Thermostat extends AppareilConnecte {

    public String thermostat;

    public Thermostat(String thermo) {
        this.thermostat = thermo;
    }

    @Override
    public void diagnostiquer() {
        super.diagnostiquer();
        System.out.println("Le thermostat de " + this.piece + " régule la température à 20°C.");
    }
    public void activerModeEco() {
        System.out.println("Le thermostat de " + this.piece + " passe en mode économique.");
    }
}
