package Tp3.ex2;

public class Mesure {
    private String station;
    private int annee;
    private double quantite;

    public Mesure(String station, int annee, double quantite) {
        this.station = station;
        this.annee = annee;
        this.quantite = quantite;
    }

    public String getStation() {
        return station;
    }

    public int getAnnee() {
        return annee;
    }

    public double getQuantite() {
        return quantite;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Mesure)) {
            return false;
        }
        Mesure other = (Mesure) obj;
        return this.station.equals(other.station) && this.annee == other.annee;
    }

    public void afficher() {
        System.out.println("Station : " + station + " | Année : " + annee + " | Quantité : " + quantite);
    }
}

