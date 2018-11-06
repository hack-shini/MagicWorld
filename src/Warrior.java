public class Warrior extends Character{

    @Override
    public int basicAttack() {
        return getStrength();
    }

    @Override
    public void specialAttack() {

    }

    @Override
    public String  warCry() {
        return "Woarggg, je suis le guerrier de ";
    }
}
