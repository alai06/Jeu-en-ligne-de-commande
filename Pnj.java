public class Pnj extends Entite{
    public String phrase;
    public Pnj(String nom, String phrase) {
        super(nom, 1);
        this.phrase = phrase;
    }
    public void  reponse(Pj pj){
       System.out.println(this.phrase);
       try {
        Thread.sleep(3000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }
}