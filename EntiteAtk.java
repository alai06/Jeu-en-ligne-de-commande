import java.util.ArrayList;
public abstract class EntiteAtk extends Entite{
    public int degat;
    public int pmt;
    public int pm;
    public boolean magique;
    public ArrayList<Sort> sorts;
    public EntiteAtk(String nom, int pvt, int degat, boolean magique, int pmt){
        super(nom, pvt);
        this.degat=degat;
        this.magique=magique;
        this.pmt=pmt;
        this.pm=pmt;
        this.sorts = new ArrayList<Sort>();
    }
    public void ajouterSort(Sort sort){
        this.sorts.add(sort);
    }
}