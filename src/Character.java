import java.util.Scanner;

public abstract class Character {

    Scanner clavier = new Scanner(System.in);

    private String  name;
    private int choice;
    private int choiceHero;


    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;

    public abstract void basicAttack();

    public abstract void specialAttack();

    public abstract void warCry();


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

    public Character choiceHero(){
        Character joueur = null;

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


}
