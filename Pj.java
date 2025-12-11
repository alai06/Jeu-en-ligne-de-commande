public class Pj extends EntiteAtk{
    private static Pj instance = new Pj("Joueur",new Metier("aucun",0,0,0,0),false,null);
    public Metier metier;
    public int niveau = 1;
    public Lieu lieu;
    public int multDegat=1;
    public int multMagie=1;
    public Pj(String nom,Metier metier,boolean magique, Lieu lieu){
        super(nom, metier.pvmax, metier.degat,magique,metier.pmmax);
        this.metier = metier;
        this.lieu=lieu;
    }
    public static Pj getInstance(){
        return instance;
    }
    public void afficherSorts(){
        int i;
        for (i=0;i<this.sorts.size();i++){
            System.out.println(this.sorts.get(i).nom);
        }
    }
    public void afficherstats(){
        System.out.println("\033[33mNom: " + this.nom+"\nNiveau: " + this.niveau + "\nMetier: " + this.metier.nom+ "\nPv: "+this.pv+"/" + this.pvt + " \npm: "+this.pm+"/" + this.pmt + " \ndegat: " + this.degat*this.multDegat +"\nmultiplicateur Magique: " +this.multMagie+"\nprotec: " + this.metier.protec+"\033[0m");
        try {
            Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
                }
    }
    public void montéeNiveau(){
        System.out.println("Vous avez monté de niveau");

        this.niveau += 1;
        System.out.println("Niveau: " + this.niveau);
        this.pvt += this.metier.pvmax;
        this.pmt += this.metier.pmmax;
        if (this.niveau % 3 == 0){
            this.multDegat += 1;
        }
        if (this.niveau%6==0){
            this.multMagie += 1;
        }
        System.out.println("Bravo vous avez monté de niveau");
        this.afficherstats();
    }
    public int bestAtk(){
        int i;
        for (i=0;i<this.sorts.size();i++){
            if ((this.pm > this.sorts.get(this.sorts.size()-1-i).cout) && (this.sorts.get(this.sorts.size()-1-i).nom!="Guérison")){
                return this.sorts.size()-1-i;
            }
        }
        return -1;
    }
    public void afficherMap(Lieu[] map){
        int i;
        int j;
        for (i=0;i<map.length;i++){
            System.out.println(map[i].nom);
            for (j=0;j<map[i].connections.size();j++){
                System.out.println("    " + map[i].connections.get(j).nom);
                
            }
            System.out.println("\n");
        }
    }
    public int puissanceBestAtk(int best){
        if (best != -1){
            return this.sorts.get(best).degat*multMagie;
        }
        else{
            return this.degat*multDegat;
        }
    }
    public void infligeDegat(int best,Monstre monstre){
        monstre.pv-=this.puissanceBestAtk(best);
        if (best != -1){
            this.pm -= this.sorts.get(best).cout;
            System.out.println("Vous utilisez " + this.sorts.get(best).nom);
            System.out.println("Vous infligez " + (this.sorts.get(best).degat*this.multMagie) + " dégats à " + monstre.nom);
            try {
                Thread.sleep(700);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
        }
        else{
            System.out.println("Vous attaquez " + monstre.nom);
            System.out.println("Vous infligez " + (this.degat*this.multDegat) + " dégats à " + monstre.nom);
            try {
                Thread.sleep(700);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
        }
    }
    public boolean guerison(){
        if (this.sorts.isEmpty()){
            System.out.println("\nVous n'avez pas de sort");
            return false;
        }
        if (this.pm > this.sorts.get(0).cout){
            this.pv = this.pvt;
            this.pm -= this.sorts.get(0).cout;
            System.out.println("\nVous vous êtes soigné avec le sort "+this.sorts.get(0).nom);
            try {
                Thread.sleep(700);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            return true;
        }
        else{
            System.out.println("\nVous n'avez pas assez de pm pour vous soigner");
            return false;
        }
    }
    public void attaquer(Monstre monstre){
        boolean soin = false;
        while (this.pv > 0 && monstre.pv > 0){
            soin = false;
            int best = this.bestAtk();
            int bestM = monstre.bestAtk();
            if ((monstre.puissanceBestAtk(bestM)>=this.pv)&&(this.puissanceBestAtk(best)<monstre.pv)){
                soin = this.guerison();
            }
            System.out.println("\033[33mVos pv: " + this.pv +"\033[0m| pv de " + monstre.nom + ": " + monstre.pv);
            System.out.println("\n\033[33mVos pm: " + this.pm + "\033[0m| pm de " + monstre.nom + ": " + monstre.pm);
            try {
                Thread.sleep(700);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            if (!soin){
                this.infligeDegat(best,monstre);
                }
            if (monstre.pv <= 0){
                System.out.println("\nVous avez vaincu "+ monstre.nom);
                this.lieu.monstres.remove(monstre);
                this.montéeNiveau();
                return;
            }
            else{
                monstre.infligeDegat(bestM,this);
            }
            if (this.pv <= 0){
                System.out.println("\nVous êtes mort...\n Fin de la partie");
            }

        }
    }
    public void seDeplacer(Lieu lieu){
        this.lieu = lieu;
    }
    public void parler(Pnj pnj){
        pnj.reponse(this);
    }
    public void seReposer(){
        if (!(this.lieu.monstres.isEmpty())){
            System.out.println("\n\033[32mVous ne pouvez pas vous reposer ici\033[0m");
            return;
        }
        System.out.println("\n\033[32mVous vous êtes reposez\033[0m");
        this.pv = this.pvt;
        this.pm = this.pmt;
        System.out.println("\n\033[33mVos pv: " + this.pv + " Vos pm: " + this.pm+"\033[0m");
    }
}