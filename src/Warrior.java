public class Warrior extends Character{

    @Override
    public int basicAttack() {
        return getStrength();
    }

    @Override
    public int specialAttack() {
        int newVitality = getLife() - (getStrength() / 2);
        setLife(newVitality);
        return getStrength() * 2;
    }

    @Override
    public String  warCry() {
        return "Woarggg, je suis le guerrier de ";
    }
}
