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


          
}
