import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ----------- Welcome text -------------

        System.out.println("Bonjour à vous, jeunes aventuriers et bienvenus dans le MagiWorld");
        System.out.println("Un monde rempli de batailles épiques et de stratègies !!");
        System.out.println();


        // ----------- Rules of the game -----------

        System.out.println("Voici les règles du jeu du MagiWorld");
        System.out.println();
        System.out.println("1 - Le jeu ce joue à 2 joueurs au tour par tour");
        System.out.println("2 - Chaque joueur choisi une classe de personnage parmis les 3 disponibles (Sorcier, rôdeur ou guerrier");
        System.out.println("3 - Une fois la classe de votre personnage choisi, vous devez choisir le niveau de votre Héros (entre 1 et 100) ");
        System.out.println("4 - Vous devrez ensuite choisir la force, l'intelligence et l'agilité de votre Héros");
        System.out.println("   - Le montant total de vos points de caractèristiques de doit pas dépasser le niveau de votre Héros. Exemple si vous êtes level 50 :");
        System.out.println("     - Votre force est de 25, votre intelligence 15 et votre agilité 10  ---> Cela est possible car le total des points est de 50");
        System.out.println("     - Votre force est de 45, votre intelligence 25 et votre agilité 15  ---> Cela n'est pas possible car le total des points est de 80");
        System.out.println("5 - Chaque tour vous avez le choix entre 2 attaques : Basique ou spéciale. Les attaques basique et spéciales différent selon la classe de votre Héros");
        System.out.println("6 - Dès qu'un Héros arrive à 0 point de vie il perd la partie");
        System.out.println();
        System.out.println("Bonne bataille et amusez vous !");
        System.out.println("");


        /**
         * Creation of player 1, choice Hero and caracteristique
         */

        Character dimitri = choiceHero("Dimitri");


        /**
         * Creation of player 2, choice Hero and caracteristique
         */
//        Character jordan = choiceHero("Jordan");
//        jordan.caracteristiques();

    }



    static Scanner clavier = new Scanner(System.in);

    /**
     * Choice your Hero
     *
     * @return return joueur = your hero
     */

    private static Character choiceHero(String name){
        Character joueur = null;
        System.out.println("Création du joueur " + name);
        System.out.println("Veuillez choisir la classe de votre Héros : 1 - Guerrier, 2 - Rôdeur, 3 - Magicien");
        int choiceHero = clavier.nextInt();

        switch (choiceHero){
            case 1:
                joueur = new Warrior();
                break;
            case 2:
                joueur = new Prowler();
                break;
            case 3:
                joueur = new Wizard();
                break;
        }

        joueur.setName(name);
        joueur.caracteristiques();
        System.out.println(joueur.toString());
                return joueur;
    }



}
