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



          
}
