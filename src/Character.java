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





        // --------------- CHOICE STRENGTH OF HERO and VERIFICATION

        System.out.println("Veuillez choisir la force de votre personnage :");
        do {

            try {
                choice = clavier.nextInt();
                reponseIsGood = true;
        }catch (InputMismatchException e){
                clavier.next();
                reponseIsGood = false;
                System.out.println("La force saisie est invalide, recommencer svp.");
                System.out.println("Veuillez choisir la force de votre personnage :");
        }

            setStrength(choice);

            if (strength > level || strength < -1){
                System.out.println("Le montant de la force saisie est incorrect, recommencer svp.");
            }

            }while (strength > level || strength < -1 || reponseIsGood == false);
        // ---- END CHOICE STRENGTH




        // --------------- CHOICE AGILITY OF HERO and VERIFICATION

        System.out.println("Veuillez choisir l'agilité de votre personnage :");
        do{

            try {
                choice = clavier.nextInt();
                reponseIsGood = true;
            }catch (InputMismatchException e){
                clavier.next();
                reponseIsGood = false;
                System.out.println("L'agilité saisie est invalide, recommencer svp.");
                System.out.println("Veuillez choisir la force de votre personnage :");
            }

            setAgility(choice);

            if (agility > level || agility < -1){
                System.out.println("Le montant de l'agilité saisie est incorrect, recommencez svp.");
            }

        }while (agility > level || agility < -1 || reponseIsGood == false);
        // ---- END CHOICE AGILITY




        // --------------- CHOICE INTELLIGENCE OF HERO and VERIFICATION

        System.out.println("Veuillez choisir l'intelligence de votre personnage :");

        do {
            try {
                choice = clavier.nextInt();
                reponseIsGood = true;
            }catch (InputMismatchException e){
                reponseIsGood = false;
                clavier.next();
                System.out.println("L'intelligence saisie est invalide, recommencer svp.");
                System.out.println("Veuillez choisir l'intelligence de votre personnage :");
            }
            setIntelligence(choice);
        }while (intelligence > level || intelligence < -1 || reponseIsGood == false);
        // ---- END CHOICE INTELLIGENCE



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
