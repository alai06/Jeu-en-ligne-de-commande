import java.util.Scanner;
public class Forgeron extends Pnj{
    private boolean armeAmelioree;
    private static Forgeron instance = new Forgeron("\033[36mForgeron\033[0m");
    private Forgeron(String nom ){
        super(nom, "\033[3mBienvenue Voyageur ! Que puis-je faire pour vous ?\033[0m");
        this.armeAmelioree = false;
    }
    public static Forgeron getForg(){
        return instance;
    }
    public boolean getArmeAmelioree(){
        return this.armeAmelioree;
    }
    public void setArmeAmelioree(boolean b){
        this.armeAmelioree = b;
    }
    public void reponse(Pj pj){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous faire ?");
        System.out.println("1: Parler");
        System.out.println("2: Ameliorer votre arme");
        int choix = 0;
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
                if (this.armeAmelioree){
                    System.out.println("Votre arme est déjà améliorée");
                    try {
                    Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
                    break;
                }
                else{
                    pj.degat*=3;
                    System.out.println("Votre arme a été améliorée");
                    try {
                    Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
                    this.armeAmelioree = true;
                }
            break;
        }
    }
} 