package compte;

/**
 * Created by ouss on 16/10/16.
 */
public class Compt {
    private int numcompte;
    private double solde;
    private double taux;

      public void setnumcompte (int n){
          this.numcompte=n;
      }
      public int getnumcompte(){
          return this.numcompte;
      }
      public void setSolde(double s){
          this.solde=s;

      }
      public double getsolde (){
          return this.solde;
      }
      public void setTaux (int t){
          this.taux=t;

      }
      public double interets(){
          return this.solde*this.taux/100;
      }
public void affichinfocompte(){
          System.out.println("le num de compte: "+getnumcompte());
          System.out.println("votre solde total est de : "+getsolde());
          System.out.println("votre taux d'interet est de : "+interets());
          System.out.println("votre solde sans interet est de : "+(getsolde()-interets()));
      }
      public void ajouter(double montant){
          this.solde=this.solde+montant;
      }
      public void retrait(double montant){
          this.solde=this.solde-montant;
      }
     import java.util.Scanner;
    public Class DAB extends Compt {
        Scanner s= new Scanner(System.in);
        boolean cond;
        public void DABI() {
        do {
            System.out.println("1_afficher les info ");
            System.out.println("2_retrait ");
            System.out.println("3_depot");
            System.out.println("4_quitter");
            System.out.println("entrer un num entre 1 et 4");
            
switch (s.nextInt()) {
                case 1:
                    affichinfocompte();
                    break;
                case 2:
                    System.out.println("combien voulez vous retirer ?");
                    retrait(s.nextDouble());
                    affichinfocompte();
                    break;
case 3:
                    System.out.println("combien voulez vous deposé ?");
                    ajouter(s.nextDouble());
                    affichinfocompte();
                    break;
                case 4:
                    cond = false;
                    break;
        
default
    System.out.println("un nombre de 1 a 4 svp ");
        break;
            }
            while (cond) ;
        }
    }      
}
    
