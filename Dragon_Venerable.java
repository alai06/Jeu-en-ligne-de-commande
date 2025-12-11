public class Dragon_Venerable extends Monstre {
    public Dragon_Venerable() {
        super("\033[31mDragon-Vénerable\033[0m", 220, 24, true, 48);
        this.ajouterSort(new Sort("\033[34mSouffle du dragon vénérable\033[0m", 60,16));
    }
}