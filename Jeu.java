
import java.util.Scanner;
public class Jeu{
    public static void main(String[] args) {
        boolean fin=false;
        while (fin==false){
        Pnj pnj1=new Pnj("\033[36mRoderick\033[0m","\033[3mBonjour aventurier! Je me nomme Roderick, je suis le chef de la ville de Padhiver.\nFaites attention en sortant de la ville, les monstres sont feroces!\033[0m");
        Pnj pnj2=new Pnj("\033[36mJuan\033[0m","\033[3mJe vous en pris , aidez nous! Il y a un dragon qui menace de terrasser notre ville! Pour l'instant il se trouve au volcan. Terrasser le avant qu'il ne soit trop tard!\033[0m");
        Pnj pnj3=new Pnj("\033[36mBandit\033[0m","\033[3mBien le bonjour avanturier, quelle magnifique bague que vous avez là! puis-je la voir de plus près?\033[0m");
        Pnj pnj4=new Pnj("\033[36mMaximilien\033[0m","\033[3mVous m'avez l'air puissant, pouvez vous éliminer les deux orcs qui rodent autour de la ville?\033[0m");
        Pnj pnj5=new Pnj("\033[36mGardien\033[0m","\033[3mBienvenue à Luskan, la ville des voleurs. Si vous voulez entrer, il vous faudra payer 10 pièces d'or.\033[0m");
        Pnj pnj6=new Pnj("\033[36mLe Marchand Submergé\033[0m","\033[3mApprochez, voyageurs des profondeurs ! Des trésors inconnus des terres vous attendent à bord de mon navire sous-marin. Que cherchez-vous aujourd'hui ?\033[0m");
        Pnj pnj7=new Pnj("\033[36mLe Sage des Profondeurs\033[0m","\033[3mDans les silences de l'abysse, j'ai lu les échos des temps anciens. Quelle sagesse ou quel mystère souhaitez-vous explorer aujourd'hui, cher voyageur?\033[0m");
        Forgeron forgeron=Forgeron.getForg();
        Grand_Sorcier grandSorcier=Grand_Sorcier.getGSor();
        
        Monstre gobelin1 = SpawnMonstre.create("Gobelin");
        Monstre gobelin2 = SpawnMonstre.create("Gobelin");
        Monstre chauveSouris1 = SpawnMonstre.create("Chauve-souris");
        Monstre chauveSouris2 = SpawnMonstre.create("Chauve-souris");
        Monstre chauveSouris3 = SpawnMonstre.create("Chauve-souris");
        Monstre orc1 = SpawnMonstre.create("Orc");
        Monstre orc2 = SpawnMonstre.create("Orc");
        Monstre orc3 = SpawnMonstre.create("Orc");
        Monstre orc4 = SpawnMonstre.create("Orc");
        Monstre orc5 = SpawnMonstre.create("Orc");
        Monstre necromant = SpawnMonstre.create("Necromant");
        Monstre geant1 = SpawnMonstre.create("Geant");
        Monstre geant2 = SpawnMonstre.create("Geant");
        Monstre geant3 = SpawnMonstre.create("Geant");
        Monstre geant4 = SpawnMonstre.create("Geant");
        Monstre dragon1 = SpawnMonstre.create("Dragon");
        Monstre dragon2 = SpawnMonstre.create("Dragon");
        Monstre dragon3 = SpawnMonstre.create("Dragon");
        Monstre dragonVenerable = SpawnMonstre.create("Dragon-Venerable");
       
        Lieu Padhiver=new Lieu("\033[1m\033[35mPadhiver\033[0m",new Monstre[]{},new Pnj[]{pnj1,pnj2},new Lieu[]{});
        Lieu RouteNord=new Lieu("\033[35mRoute Nord\033[0m",new Monstre[]{},new Pnj[]{pnj3},new Lieu[]{Padhiver});    
        Lieu RouteSud=new Lieu("\033[35mRoute Sud\033[0m",new Monstre[]{orc1,orc2},new Pnj[]{pnj4},new Lieu[]{Padhiver});
        Lieu Foret=new Lieu("\033[35mForet\033[0m",new Monstre[]{gobelin1,gobelin2},new Pnj[]{},new Lieu[]{RouteNord});
        Lieu Luskan=new Lieu("\033[1m\033[35mLuskan\033[0m",new Monstre[]{},new Pnj[]{pnj5},new Lieu[]{RouteNord});
        Lieu Eauprofonde=new Lieu("\033[1m\033[35mEauprofonde\033[0m",new Monstre[]{},new Pnj[]{pnj6,pnj7},new Lieu[]{RouteSud});
        Lieu RouteRiviere=new Lieu("\033[35mRoute de la Riviere\033[0m",new Monstre[]{orc3,orc4,orc5},new Pnj[]{},new Lieu[]{Luskan});
        Lieu RouteSudEst=new Lieu("\033[35mRoute Sud-Est\033[0m",new Monstre[]{geant1,geant2},new Pnj[]{},new Lieu[]{Eauprofonde});
        Lieu Mirabar=new Lieu("\033[1m\033[35mMirabar\033[0m",new Monstre[]{},new Pnj[]{forgeron,grandSorcier},new Lieu[]{RouteRiviere});
        Lieu MaraisDesMorts=new Lieu("\033[35mMarais des Morts\033[0m",new Monstre[]{chauveSouris1,chauveSouris2,chauveSouris3},new Pnj[]{},new Lieu[]{RouteSud});
        Lieu RouteNordEst=new Lieu("\033[35mRoute Nord-Est\033[0m",new Monstre[]{geant3,geant4},new Pnj[]{},new Lieu[]{RouteSudEst,Mirabar});
        Lieu Crypte=new Lieu("\033[35mCrypte\033[0m",new Monstre[]{necromant},new Pnj[]{},new Lieu[]{MaraisDesMorts});
        Lieu Volcan=new Lieu("\033[35mVolcan\033[0m",new Monstre[]{dragon1},new Pnj[]{},new Lieu[]{Foret});
        Lieu Montagne=new Lieu("\033[35mMontagne\033[0m",new Monstre[]{dragon2,dragon3},new Pnj[]{},new Lieu[]{RouteSud});
        Lieu HauteMontagnes=new Lieu("\033[35mHaute Montagnes\033[0m",new Monstre[]{},new Pnj[]{},new Lieu[]{Montagne});
        Lieu PicDuMonde=new Lieu("\033[35mPic du Monde\033[0m",new Monstre[]{dragonVenerable},new Pnj[]{},new Lieu[]{HauteMontagnes});


        Padhiver.connections.add(RouteNord);
        Padhiver.connections.add(RouteSud);
        RouteNord.connections.add(Foret);
        RouteNord.connections.add(Luskan);
        RouteSud.connections.add(MaraisDesMorts);
        RouteSud.connections.add(Eauprofonde);
        RouteSud.connections.add(Montagne);
        Foret.connections.add(Volcan);
        Luskan.connections.add(RouteRiviere);
        Eauprofonde.connections.add(RouteSudEst);
        RouteRiviere.connections.add(Mirabar);
        RouteSudEst.connections.add(RouteNordEst);
        Mirabar.connections.add(RouteNordEst);
        MaraisDesMorts.connections.add(Crypte);
        Montagne.connections.add(HauteMontagnes);
        HauteMontagnes.connections.add(PicDuMonde);
        Lieu[] carteDuMonde = {Padhiver,RouteNord,RouteSud,Foret,Luskan,Eauprofonde,RouteRiviere,RouteSudEst,Mirabar,MaraisDesMorts,Montagne,HauteMontagnes,PicDuMonde};
        
        /* Padhiver =(Ville) Padhiver;
        Luskan =(Ville) Luskan;
        Eauprofonde =(Ville) Eauprofonde;
        Mirabar =(Ville) Mirabar; */


        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nom pour votre personnage:");
        String nom = sc.next();
        System.out.println("\n\n\n\n\n\n\n\nBienvenue dans la ville de "+Padhiver.nom+"! \n\n\nChoisissez votre classe et partez à l'aventure! \n\nTapez 1 pour Barbare, \n\n2 pour Guerrier, \n\n3 pour Mage.\n\nTapez 4 pour quitter. ");
        int choix = 0;
        try{
            choix = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Erreur de saisie");
        }

        Pj joueur;

        switch (choix) {
            case 1:
                joueur = new Pj(nom, new Barbare(),false, Padhiver);
                break;
            case 2:
                joueur = new Pj(nom, new Guerrier(),false, Padhiver);
                break;
            case 3:
                joueur = new Pj(nom, new Magicien(),true, Padhiver);
                joueur.ajouterSort(new Sort("\033[34mGuérison\033[0m", 0, 10));
                joueur.ajouterSort(new Sort("\033[34mRayon de givre\033[0m", 4, 2));
                joueur.ajouterSort(new Sort("\033[34mBoule de feu\033[0m", 15, 9));
                break;
            case 4:
                joueur = null;
                System.out.println("\nVous quittez le jeu.");
                sc.close();
                System.exit(0);
                break;
            default:
                joueur = null;
                System.out.println("\nVous quittez le jeu.");
                sc.close();
                System.exit(0);
                break;
        }
        System.out.println("\033[35m(Conseil: mettez la console en plein écran pour une meilleure expérience de jeu)\033[0m");
        while(joueur.niveau < 20 && joueur.pv > 0){
            System.out.println("\nVous êtes à "+joueur.lieu.nom+"\n\n Que voulez vous faire? \n\n 1: \033[35mSe déplacer\033[0m \n\n 2: \033[36mParler\033[0m \n\n 3: \033[31mAttaquer\033[0m \n\n 4: \033[32mSe reposer\033[0m\n\n 5: \033[33mStatistiques\033[0m\n\n 6: \033[35mCarte du Monde\033[0m\n\n 7: Quitter\n\n");
            choix =1;
            try{
                choix = sc.nextInt();
            }
            catch(Exception e){
                System.out.println("Erreur de saisie");
            }
            switch(choix){
                case 1:
                    System.out.println("\nOù voulez vous aller? \n\n ");
                    for (int i=0;i<joueur.lieu.connections.size();i++){
                        System.out.println(i+": "+joueur.lieu.connections.get(i).nom);
                    }
                    choix = sc.nextInt();
                    if ((choix>=joueur.lieu.connections.size())||(choix<0)){
                        System.out.println("\nMauvais choix de lieu, vous restez ici");
                        break;
                    }
                    else{
                        joueur.seDeplacer(joueur.lieu.connections.get(choix));
                    }
                    break;
                case 2:
                    if (joueur.lieu.pnjs.isEmpty()){
                        System.out.println("\nIl n'y a personne ici");
                    }
                    else{
                        System.out.println("\nA qui voulez vous parler? \n\n ");
                        for (int i=0;i<joueur.lieu.pnjs.size();i++){
                            System.out.println(i+": "+joueur.lieu.pnjs.get(i).nom);
                        }
                        choix = sc.nextInt();
                        if ((choix>=joueur.lieu.pnjs.size())||(choix<0)){
                            System.out.println("\nMauvais choix de pnj, vous ne parlez à personne");
                            break;
                        }
                        else{
                            joueur.lieu.pnjs.get(choix).reponse(joueur);
                        }
                    }
                    break;
                case 3:
                    if (joueur.lieu.monstres.isEmpty()){
                        System.out.println("\nIl n'y a pas de monstre ici");
                    }
                    else{
                        System.out.println("\nQuel monstre voulez vous attaquer? \n\n ");
                        for (int i=0;i<joueur.lieu.monstres.size();i++){
                            System.out.println(i+": "+joueur.lieu.monstres.get(i).nom);
                        }
                        choix = sc.nextInt();
                        if ((choix>=joueur.lieu.monstres.size())||(choix<0)){
                            System.out.println("\nMauvais choix de monstre, vous ne vous attaquez à personne");
                            break;
                        }
                        else{
                            joueur.attaquer(joueur.lieu.monstres.get(choix));
                        }
                    }
                    break;
                case 4:
                    joueur.seReposer();
                    break;
                case 5:
                    joueur.afficherstats();

                    break;
                case 6:
                    joueur.afficherMap(carteDuMonde);
                    break;
                case 7:
                    System.out.println("\nVous quittez le jeu.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }
        System.out.println("\nBravo vous avez vaicu tout les monstres qui menacaient Padhiver!\n\nVous avez gagné la partie!\n\nFin du jeu");
        System.out.println("\n\n    Voulez vous rejouer? \n\n 1: Oui \n\n 2: Non\n\n");
        try{choix = sc.nextInt();}
        catch(Exception e){
            System.out.println("Erreur de saisie");
        }
        if (choix==1){
            fin=false;
            forgeron.setArmeAmelioree(false);
            grandSorcier.setSortCosmique(false);
        }
        else{
            fin=true;
        sc.close();
        }
    }
}
}

