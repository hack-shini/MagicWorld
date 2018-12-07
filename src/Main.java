import java.util.InputMismatchException;
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

        System.out.println("");

        /**
         * Creation of player 2, choice Hero and caracteristique
         */
        Character jordan = choiceHero("Jordan");

        /**
         * Call fight method for the fight
         */
        fight(dimitri, jordan);


    }



    static Scanner clavier = new Scanner(System.in);

    /**
     * Choice your Hero
     *
     * @return return joueur = your hero
     */

    private static Character choiceHero(String name) {

        Character joueur = null;
        int choiceHero = 0;
        boolean responseIsGood;
        System.out.println("Création du joueur " + name);

        // Boucle for the choice of Hero
        do {
            System.out.println("Veuillez choisir la classe de votre Héros : 1 - Guerrier, 2 - Rôdeur, 3 - Magicien");


            // Test choiceHero != string
           try {
               choiceHero = clavier.nextInt();
               responseIsGood = true;
           }catch (InputMismatchException e){
               clavier.next();
               System.out.println("Vous avez saisi un caractère non valide");
               responseIsGood = false;
           }


           // Switch for the choice of Hero
            switch (choiceHero) {
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
        } while (choiceHero < 1 || choiceHero > 3 || responseIsGood == false);

        joueur.setName(name);
        joueur.caracteristiques(); //Call public void caracteristique() for the skill of your hero
        System.out.println(joueur.toString());
        return joueur;


    }

    private static void fight(Character joueur1, Character joueur2){
            do{
                // Change hero who attack
                Character temp;
                temp = joueur1;
                joueur1 = joueur2;
                joueur2 = temp;


                System.out.println(" ");
                System.out.println(joueur1.getName() + " , vous avez le choix entre 2 attaques : 1 - Basique, 2 - Spéciale");
            }while (joueur1.getLife() <= 0 || joueur2.getLife() <= 0);
    }





}
