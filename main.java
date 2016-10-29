
package gestion_de_la_paie;

public class main {
    public static void main(String[] args) {
        Employe tab[]=new Employe[3];
        tab[0]=new Employe("salim","PDG");
        tab[0].setSalaire(100000);
        tab[0].afficher();
        EmployePlainTemps halima=new EmployePlainTemps("halima","secretaire",5000);
        halima.calculPlainTemps(0);
        tab[1]=halima;
        tab[1].afficher();
        EmployeTempsPartiel abdelhalim=new EmployeTempsPartiel("abdelhalim","agent de securite",100);
        abdelhalim.calculTempsPartiel(150);
        tab[2]=abdelhalim;
        tab[2].afficher();
        
        
    }
    
}
