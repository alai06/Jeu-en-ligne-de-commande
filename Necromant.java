public class Necromant extends Monstre{
    public Necromant(){
    super("\033[31mNecromant\033[0m", 30, 8, false, 10);
    this.ajouterSort(new Sort ("\033[34mTransfert de vie\033[0m",12,5));
}
public void transfertvie(Pj pj){
    if (this.pm>=5){
        this.pm-=this.sorts.get(0).cout;
        pj.pv-=this.sorts.get(0).degat;
        this.pv=Integer.min(this.pv+6, this.pvt);   
        System.out.println("\n"+this.nom +" s'est soigné de 6 pv avec le sort "+ this.sorts.get(0).nom);
        }
    else{
        System.out.println("\n"+this.nom +" n'a pas assez de pm pour utiliser le sort "+ this.sorts.get(0).nom);
        }
    }
}    
