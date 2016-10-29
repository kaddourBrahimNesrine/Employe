package gestion_de_la_paie;


public class Employe {
    private String nom,fonction;
    private double salaire;
    public Employe(String nom,String fonction){
        this.nom=nom;
        this.fonction=fonction;
    }
    public void setSalaire(double salaire){
    this.salaire=salaire;
    }
    public String getNom(){
    return nom;
    }
    public String getFonction(){
    return fonction;
    }
    public double getSalaire(){
    return salaire;
    }
    public String toString(){
    return nom+" ("+fonction+") ***"+salaire;
    }
    public void afficher(){
        System.out.println("payer a l'ordre de "+toString());
    }
    
}
