public abstract class Monstre extends EntiteAtk{
    public Monstre(String nom, int pvt, int degat, boolean magique, int pmt){
        super(nom, pvt, degat, magique, pmt);
    }
    public int bestAtk(){
        if (this.sorts.size()==0){
            return -1;
        }
        int i;
        for (i=0;i<this.sorts.size();i++){
            if ((this.pm > this.sorts.get(this.sorts.size()-1-i).cout)){
                return this.sorts.size()-1-i;
            }
        }
        return -1;
    }
    public int puissanceBestAtk(int best){
        if (best != -1){
            return this.sorts.get(best).degat;
        }
        else{
            return this.degat;
        }
    }
    public void infligeDegat(int best,Pj pj){
        if (best != -1){
            pj.pv-=this.puissanceBestAtk(best);
            this.pm -= this.sorts.get(best).cout;
            System.out.println(this.nom + " utilise " + this.sorts.get(best).nom);
            System.out.println("Il vous inflige " + this.sorts.get(best).degat + " dégats");
        }
        else{
            pj.pv-=this.puissanceBestAtk(best)-pj.metier.protec;
            System.out.println(this.nom + " vous attaque");
            System.out.println("Il vous inflige " + (this.degat-pj.metier.protec) + " dégats");
        }

    }
}