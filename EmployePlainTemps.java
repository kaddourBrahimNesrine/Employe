package gestion_de_la_paie;

public class EmployePlainTemps extends Employe {
    private double salaireParSemaine;
    public EmployePlainTemps(String nom, String fonction,double salaireParSemain) {
        super(nom, fonction);
        this.salaireParSemaine=salaireParSemain;
    }
    public void calculPlainTemps(double prime){
        setSalaire(salaireParSemaine*4+prime);
    }
    
}
