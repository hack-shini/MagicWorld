import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Character {

    private String  name;

    private int choice;

    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;

    public abstract int basicAttack();

    public abstract int specialAttack();

    public abstract String  warCry();


    // ---------- GETTERS AND SETTERS ----------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Choice Skills

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        this.life = level * 5;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int ability) {
        this.agility = ability;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }



    // ---------- ALL OTHERS METHODS ----------




    /**
     * Choice skills of your Heros
     */

    public void caracteristiques(){
        Scanner clavier = new Scanner(System.in);
        boolean reponseIsGood;

        // --------------- CHOICE LEVEL OF HERO and VERIFICATION

        System.out.println("Veuillez choisir le niveau de votre personnage :");
        do {

            try {
                choice = clavier.nextInt();
                reponseIsGood = true;
            }catch (InputMismatchException e){
                clavier.next();
                reponseIsGood = false;
            }

            setLevel(choice);

            if (level <=0 || level >100){
                System.out.println("Le niveau saisi est invalide, recommencer svp.");
            }

        }while (level <=0 || level >100 || reponseIsGood == false);
        // ---- END CHOICE LEVEL



        // BOUCLE FOR VERIFICATION OF STR + ABILITY + INTEL <= LEVEL |||||||||||||||||||||| AND CHOICE STR / ABI / INTEL
        do {

            // --------------- CHOICE STRENGTH OF HERO and VERIFICATION

            do {
                System.out.println("Veuillez choisir la force de votre personnage :");
                try {
                    choice = clavier.nextInt();
                    reponseIsGood = true;
                }catch (InputMismatchException e){
                    clavier.next();
                    reponseIsGood = false;
                }

                setStrength(choice);

                if (strength > level || strength < -1){
                    System.out.println("La force saisie est invalide, recommencer svp.");
                }else if (reponseIsGood == false){
                    System.out.println("La force saisie est invalide, recommencer svp.");
                }

            }while (strength > level || strength < -1 || reponseIsGood == false);
            // ---- END CHOICE STRENGTH




            // --------------- CHOICE AGILITY OF HERO and VERIFICATION

            do{
                System.out.println("Veuillez choisir l'agilité de votre personnage :");
                try {
                    choice = clavier.nextInt();
                    reponseIsGood = true;
                }catch (InputMismatchException e){
                    clavier.next();
                    reponseIsGood = false;
                }

                setAgility(choice);

                if (agility > level || agility < -1){
                    System.out.println("L'agilité saisie est invalide, recommencer svp.");
                }else if (reponseIsGood == false){
                    System.out.println("L'agilité saisie est invalide, recommencer svp.");
                }

            }while (agility > level || agility < -1 || reponseIsGood == false);
            // ---- END CHOICE AGILITY




            // --------------- CHOICE INTELLIGENCE OF HERO and VERIFICATION

            do {
                System.out.println("Veuillez choisir l'intelligence de votre personnage :");
                try {
                    choice = clavier.nextInt();
                    reponseIsGood = true;
                }catch (InputMismatchException e){
                    reponseIsGood = false;
                    clavier.next();
                }
                setIntelligence(choice);

                if (intelligence > level || intelligence < -1){
                    System.out.println("L'intelligence saisie est invalide, recommencer svp.");
                }else if (reponseIsGood == false){
                    System.out.println("L'intelligence saisie est invalide, recommencer svp.");
                }
            }while (intelligence > level || intelligence < -1 || reponseIsGood == false);
            // ---- END CHOICE INTELLIGENCE

            if ((intelligence + agility + strength) > level){
                System.out.println("Le total de vos points de force, abilité et intelligence dépasse votre level.");
                System.out.println("Petit rappel de la règle n°4.");
                System.out.println("4 - Vous devrez choisir la force, l'intelligence et l'agilité de votre Héros");
                System.out.println("   - Le montant total de vos points de caractèristiques de doit pas dépasser le niveau de votre Héros. Exemple si vous êtes level 50 :");
                System.out.println("     - Votre force est de 25, votre intelligence 15 et votre agilité 10  ---> Cela est possible car le total des points est de 50");
                System.out.println("     - Votre force est de 45, votre intelligence 25 et votre agilité 15  ---> Cela n'est pas possible car le total des points est de 80");
                System.out.println("");
                System.out.println("Veuillez recommencer la saisie de vos compétences.");
            }

        }while ((intelligence + agility + strength) > level); // END BOUCLE






    }

    @Override
    public String toString() {
        return    this.warCry() + getName() +
                ", mon niveau est de " + getLevel() +
                ", je possède " + getLife() + " de vitalité " +
                ", ma force est de "+ getStrength()+
                ", mon agilité est de "+ getAgility()+
                ", mon intelligence est de "+ getIntelligence()+" !";
    }




}
