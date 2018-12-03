public class Prowler extends Character {

    @Override
    public int basicAttack() {
        return getAgility();
    }

    @Override
    public int specialAttack() {
        return (getLevel() / 2) + getAgility();
    }

    @Override
    public String  warCry() {
        return "Dans le mile ! Je suis le rôdeur de ";
    }
}
