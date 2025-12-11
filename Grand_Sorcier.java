import java.util.Scanner;
public class Grand_Sorcier extends Pnj{
    private boolean sortCosmique;
    private static Grand_Sorcier instance = new Grand_Sorcier("\033[36mGrand Sorcier\033[0m");
    private Grand_Sorcier(String nom ){
        super(nom, "\033[3mBienvenue Voyageur ! Voulez-vous en apprendre plus sur les sorts cosmiques?\033[0m");
    }
    public static Grand_Sorcier getGSor(){
        return instance;
    }
    public boolean getSortCosmique(){
        return this.sortCosmique;
    }
    public void setSortCosmique(boolean b){
        this.sortCosmique = b;
    }
    public void reponse(Pj pj){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous faire ?");
        System.out.println("1: Parler");
        System.out.println("2: Apprendre un sort");
        int choix =0;
        try{
            choix = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Erreur de saisie");
            
        }
            switch(choix){
                case 1:
                    System.out.println(this.phrase);
                    try {
                        Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }
                    break;
                case 2:
                    if (!(pj.metier instanceof Magicien)){
                        System.out.println("Vous n'êtes pas un magicien");
                        try {
                            Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                        break;
                    }
                    else if (this.sortCosmique){
                        System.out.println("Vous avez déjà appris le sort cosmique");
                        try {
                            Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                        break;
                    }
                    else{
                        pj.ajouterSort(new Sort("\033[34mNuée de météorites\033[0m", 30, 15));
                        System.out.println("Vous avez appris le sort \033[34mNuée de météorites\033[0m\nDégats: 30\nCout: 15");
                        try {
                            Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                        this.sortCosmique = true;
                    }
                break;
                
            }
    }
} 