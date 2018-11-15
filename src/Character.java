import java.util.Scanner;

public abstract class Character {


    Character joueur;

    private String  name;

    Scanner clavier = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int choice;
    private int choiceHero;


    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;

    public abstract int basicAttack();

    public abstract void specialAttack();

    public abstract String  warCry();


    // ---------- GETTERS AND SETTERS ----------

    // Choice Hero

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getChoiceHero() {
        return choiceHero;
    }

    public void setChoiceHero(int choiceHero) {
        this.choiceHero = choiceHero;
    }


    // Choice Skills

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife() {
        return getLevel() * 5;
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

        System.out.println("Veuillez choisir le niveau de votre personnage :");
        choice = clavier.nextInt();
        setLevel(choice);

        System.out.println("Veuillez choisir la force de votre personnage :");
        choice = clavier.nextInt();
        setStrength(choice);

        System.out.println("Veuillez choisir l'agilité de votre personnage :");
        choice = clavier.nextInt();
        setAgility(choice);

        System.out.println("Veuillez choisir l'intelligence de votre personnage :");
        choice = clavier.nextInt();
        setIntelligence(choice);
    }

    @Override
    public String toString() {
        return    joueur.warCry() + getName() +
                ", mon niveau est de " + getLevel() +
                ", je possède " + getLife() + " de vitalité " +
                ", ma force est de "+ getStrength()+
                ", mon agilité est de "+ getAgility()+
                ", mon intelligence est de "+ getIntelligence()+" !";
    }


}
