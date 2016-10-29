package gestion_de_la_paie;

public class EmployeTempsPartiel extends Employe {
    private double salaireHeure;
    public EmployeTempsPartiel(String nom, String fonction,double salaireHeure) {
        super(nom, fonction);
        this.salaireHeure=salaireHeure;
    }
    public void calculTempsPartiel(int heure){
        setSalaire(salaireHeure*heure);
    }
}
