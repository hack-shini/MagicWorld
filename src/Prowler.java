public class Prowler extends Character {

    @Override
    public int basicAttack() {
        return getAgility();
    }

    @Override
    public int specialAttack() {
        int newAgility = (getLevel() / 2) + getAgility();
        setAgility(newAgility);
        return 0;
    }

    @Override
    public String  warCry() {
        return "Dans le mile ! Je suis le rôdeur de ";
    }
}
