# Projet PCOO 3 --- Jeu Java

**Auteurs :** - Taieb Yannis --- 22027534 - Cherigui Allah-Eddine ---
22107260

## Description du projet

Ce projet est un jeu textuel développé dans le cadre du module PCOO 3.\
Le fichier principal contenant la méthode `main` est **Jeu.java**.

Le jeu inclut : - un système de combat, - des interactions avec des
PNJ, - une carte du monde, - des statistiques de personnage, - la
possibilité de quitter ou rejouer à tout moment.

Des Thread.sleep() ont été ajoutés pour permettre au joueur de lire les
dialogues et les phases de combat.

## Instructions de saisie

-   Pour le nom du joueur, entrer une chaîne de caractères sans
    accolades et sans espaces.
-   Pour tous les scans suivants, entrer un entier (sans accolade ni
    espace).
-   Pour annuler un choix, entrer une valeur non indiquée dans les
    options.
-   Vous pouvez effectuer plusieurs actions d'affilée en saisissant
    plusieurs entiers séparés par des espaces.

## Fonctionnalités ajoutées

-   Fonction statistique : affiche les statistiques du joueur.
-   Fonction carte du monde : affiche la carte du monde.
-   Fonction quitter : permet de quitter le jeu à tout moment.
-   Fonction rejouer : permet de recommencer une partie lorsque le
    joueur meurt ou atteint le niveau 20.

## Compilation et exécution

### Avec l'extension AIOCompiler (VS Code)

-   Supprimer le dossier .output du projet.
-   Compiler directement le fichier Jeu.java via l'engrenage de
    l'extension dans VS Code.

### Compilation manuelle (sans extension)

Compiler les fichiers dans l'ordre suivant :

1.  Sort.java
2.  Entite.java
3.  Metier.java
4.  Barbare.java, Magicien.java, Guerrier.java
5.  EntiteAtk.java
6.  Monstre.java
7.  Tous les monstres individuels (exemple : Gobelin.java)
8.  SpawnMonstre.java
9.  Pnj.java
10. Forgeron.java, Grand_Sorcier.java
11. Lieu.java
12. Pj.java
13. Jeu.java (main)

### Commande générique (si tous les fichiers sont dans le même dossier)

    javac *.java
    java Jeu

## Lancement du jeu

    java Jeu
