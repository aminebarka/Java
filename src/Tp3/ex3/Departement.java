package Tp3.ex3;

import java.util.ArrayList;

public class Departement {
    private String nomDepartement;
    private ArrayList<Employe> listeEmployes;

    public Departement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
        this.listeEmployes = new ArrayList<>();
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public ArrayList<Employe> getListeEmployes() {
        return listeEmployes;
    }

    public boolean ajouterEmploye(Employe employe) {
        if (!listeEmployes.contains(employe)) {
            listeEmployes.add(employe);
            return true;
        }
        return false;
    }
}
