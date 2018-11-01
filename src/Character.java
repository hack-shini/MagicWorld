import java.util.Scanner;

public abstract class Character {

    Character joueur;

    Scanner clavier = new Scanner(System.in);

    private String  name;

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

    public abstract void basicAttack();

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
     * Choice your Hero
     *
     * @return return joueur = your hero
     */

    public Character choiceHero(){
        this.joueur = joueur;

        int choiceHero = clavier.nextInt();

        switch (choiceHero){
            case 1:
                joueur = new Warrior();
                setChoiceHero(choiceHero);
                break;
            case 2:
                joueur = new Prowler();
                setChoiceHero(choiceHero);
                break;
            case 3:
                joueur = new Wizard();
                setChoiceHero(choiceHero);
                break;
        }
        return joueur;
    }


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
