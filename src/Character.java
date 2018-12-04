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

        }while (level <=0 || level >100);

        // --------------- CHOICE STRENGTH OF HERO and VERIFICATION

        System.out.println("Veuillez choisir la force de votre personnage :");
        do {

            try {
                choice = clavier.nextInt();
                reponseIsGood = true;
        }catch (InputMismatchException d){
                clavier.next();
                reponseIsGood = false;
                System.out.println("Le niveau saisi est invalide, recommencer svp.");
        }

            setStrength(choice);

            if (strength > level || strength < -1){
                System.out.println("Le montant de la force saisie est incorrect, recommencer svp.");
            }

            }while (strength > level || strength < -1 );




        System.out.println("Veuillez choisir l'agilité de votre personnage :");
        choice = clavier.nextInt();
        setAgility(choice);

        System.out.println("Veuillez choisir l'intelligence de votre personnage :");
        choice = clavier.nextInt();
        setIntelligence(choice);

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
