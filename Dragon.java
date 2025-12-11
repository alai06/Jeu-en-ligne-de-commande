public class Dragon extends Monstre{
    public Dragon(){
        super("\033[31mDragon\033[0m", 70, 12, true, 24);
        this.ajouterSort(new Sort("\033[34mSouffle du dragon\033[m", 20,8));
    }
}