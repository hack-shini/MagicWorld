public class Prowler extends Character {

    @Override
    public int basicAttack() {
        return getAgility();
    }

    @Override
    public void specialAttack() {

    }

    @Override
    public String  warCry() {
        return "Dans le mile ! Je suis le rôdeur de ";
    }
}
