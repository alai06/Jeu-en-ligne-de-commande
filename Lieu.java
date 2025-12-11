import java.util.ArrayList;
public  class Lieu{
    public String nom;
    public ArrayList<Monstre> monstres = new ArrayList<>() ;
    public ArrayList<Pnj> pnjs = new ArrayList<>();
    public ArrayList<Lieu> connections= new ArrayList<>();
    public Lieu(String nom, Monstre[] monstres, Pnj[] pnjs, Lieu[] connections){
        this.nom = nom;
        this.ajouterMonstre(monstres);
        this.ajouterPnj(pnjs);
        this.ajouterLieu(connections);

    }

    public void ajouterMonstre(Monstre[] monstres){
        int i;
        for (i=0;i<monstres.length;i++){
            this.monstres.add(monstres[i]);
        }
    }
    public void ajouterPnj(Pnj[] pnjs){
        int i;
        for (i=0;i<pnjs.length;i++){
            this.pnjs.add(pnjs[i]);
        }
    }
    public void ajouterLieu(Lieu[] lieux){
        int i;
        for (i=0;i<lieux.length;i++){
            this.connections.add(lieux[i]);
        }
    }

}